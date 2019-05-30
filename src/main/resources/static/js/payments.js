$(document).ready(function () {
    loadAllPayments();
});

function loadAllPayments(){
    var dataTable = $("#payments-table").DataTable();

    $.ajax({
        url: "/api/payments/detail",
        type: "GET"
    }).done(function (payments){
        $.each(payments, function(){
            dataTable.row.add([
                this.idCliente,
                this.folioReservacion,
                this.numPago,
                this.nombre,
                this.apellido,
                this.montoPagado,
                this.montoRestante,
                this.fechaPago
            ]);
        });
        dataTable.draw();
    });
}