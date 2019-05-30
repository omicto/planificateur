$(document).ready(function () {
    var table = $("#places_table").DataTable();

    $.ajax({
        url: "/api/places",
        type: "GET"
    }).done(function(places){
        $.each(places, function(){
            table.row.add([
                this.idLocal,
                this.calle,
                this.colonia,
                this.ciudad,
                this.capacidad,
                this.costoPorHora,
                this.idEncargado,
                ""
            ]);
        });
        table.draw();
    });
    
    $("#place_form").on("submit", function (e) {
        e.preventDefault();
        $.post("/api/places/new", $("#place_form").serialize(), function () {
            alert("Success");
        })
    });
});

