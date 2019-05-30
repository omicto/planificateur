$(document).ready(function() {
    var select = $("#select-reservation");
    var option = $("<option />");
    $.ajax({
        url: "/api/reservations/pending",
        type: "GET"
    }).done(function (res) {
        $.each(res, function () {
            option = $("<option />");
            option.val(this.folioReservacion);
            option.attr("data-total", this.costoTotal);
            option.text("#" + this.folioReservacion + " on the " + new Date(this.fechaReservada));
            select.append(option);
            console.log(this);
        })
    });

    var $form = $("#new-payment-form");
    $form.on("submit", function(e){
        e.preventDefault();
        var data = new FormData($form[0]);
        console.log(data.get("payment"));
        $.ajax({
            url: "/api/payments/" + data.get("folioReservacion"),
            type: "POST",
            data: {payment: data.get("payment")}
        }).done(function(data){
            alert(data);
        }).fail(function (e) {
            alert(e);
        });
    });
});