function loadPackage(){
    var table = $("#packages_table").DataTable();
    var string = "";
    $.ajax({
        url: "/api/packages",
        type: "GET"
    }).done(function(packages){
        $.each(packages, function(){
            string = "<button type='button' class='btn btn-primary edit-package-btn' " +
                "onClick = 'deletePackage("+ this['idPaquete']+")' data-packageDescription='" + this['descripcion']+ " " +this['costo']+"'" +
                " data-packageId='" + this['idPaquete']+"'" +">" +
                "X" + "</button>";
            table.row.add([
                this['idPaquete'],
                this['descripcion'],
                this['detalles'],
                this['costo'],
                string
            ]).draw(true);
        })
    });
}
$(document).ready(function(){
    loadPackage();
    $("#package_form").submit(function(e){
        e.preventDefault();
        $.ajax({
            url: "/api/packages/new",
            type: "POST",
            data: $("#package_form").serialize()
        })
            .done(function(){
                alert("Data sent!");
                location.reload();
            })
            .fail(function(){
                alert("error");
            });
    });
});
function deletePackage (id){

    $.ajax({
        url: "/api/packages/" + id,
        type : 'DELETE'
    })
        .done(function(){
            alert($(this).prop('data-packageDescription') + " ha sido eliminado");
        })
        .fail(function (){
            alert("Error en la eliminación");

        });
}

