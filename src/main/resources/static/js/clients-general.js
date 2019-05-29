function load(){
    var table = $("#clients_table").DataTable();
    $.ajax({
        url: "/api/clients",
        type: "GET"
    }).done(function(clients){
        $.each(clients, function(){
            table.row.add([
                this['idCliente'],
                this['nombre'],
                this['apellido'],
                this['numTelefono'],
                this['clienteDesde']
            ]).draw(false);
        })
    });
}
$(document).ready(function(){
    load();
});