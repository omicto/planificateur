function load(){
    var table = $("#clients_table").DataTable();
    var string = "";
    $.ajax({
        url: "/api/clients",
        type: "GET"
    }).done(function(clients){
        $.each(clients, function(){
            string = "<button type = 'button' class = 'btn btn-primary edit-client-btn' " +
                "data-toggle='modal' data-target='#delete-client-modal' " +
                "data-clientName='" + this['nombre']+ " " +this['apellido']+"'" +
                " data-clientId='" + this['idCliente']+"'" +">" +
                "X" + "</button>";
            table.row.add([
                this['idCliente'],
                this['nombre'],
                this['apellido'],
                this['numTelefono'],
                this['clienteDesde'],
                string
            ]).draw(false);
        })
    });
}
function deleteClient(dataClientId){

}
$(document).ready(function(){
    load();
    $('#delete-client-modal').on('show.bs.modal', function (event) {
        var button = $(event.relatedTarget) ;// Button that triggered the modal
        var name = button.data('clientName'); // Extract info from data-* attributes
        var id = button.data('clientId');
        console.debug("name", name);
        var modal = $(this);
        modal.find('.modal-title').text('Delete a client');
        modal.find('.modal-body p').text('Are you sure you want to delete ' + name + '?');
    });
    $("#client_form").submit(function(e){
        e.preventDefault();
        $.ajax({
            url: "/api/clients",
            type: "POST",
            data: $("#client_form").serialize()
        })
            .done(function(){
                alert("Data sent!");
            })
            .fail(function(){
                alert("error");
            });
    });
});

