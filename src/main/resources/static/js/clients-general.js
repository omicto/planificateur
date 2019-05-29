function load(){
    var table = $("#clients_table").DataTable();
    var string = "";
    $.ajax({
        url: "/api/clients",
        type: "GET"
    }).done(function(clients){
        $.each(clients, function(){
            string = "<button type='button' class='btn btn-primary edit-client-btn' " +
                "onClick = 'deleteClient()' data-clientName='" + this['nombre']+ " " +this['apellido']+"'" +
                " data-clientId='" + this['idCliente']+"'" +">" +
                "X" + "</button>";
            table.row.add([
                this['idCliente'],
                this['nombre'],
                this['apellido'],
                this['numTelefono'],
                this['clienteDesde'],
                string
            ]).draw(true);
        })
    });
}
$(document).ready(function(){
    load();
    $("#client_form").submit(function(e){
        e.preventDefault();
        $.ajax({
            url: "/api/clients/new",
            type: "POST",
            data: $("#client_form").serialize()
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
function deleteClient (){
    var id = $(this).prop("data-clientId");
    $.ajax({
        url: "/api/clients/" + id,
        type : 'DELETE'
    })
        .done(function(){
            alert($(this).prop('data-clientName') + " ha sido eliminado");
        })
        .fail(function (){
            alert("Error en la eliminación");
        });
}

