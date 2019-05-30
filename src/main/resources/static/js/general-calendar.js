document.addEventListener('DOMContentLoaded', function () {
    load();
    var calendarEl = document.getElementById('general-calendar');
    var calendar = new FullCalendar.Calendar(calendarEl, {
        timeZone: 'UTC',
        plugins: ['interaction','dayGrid', 'timeGrid'],
        events: '/api/events',
        header: {
            left:   'dayGridMonth,timeGridWeek,timeGridDay',
            center: 'addEventButton, title',
            right:  'today prev,next'
        },
        navLinks: true,
        selectable: true,
        select: function (info) {
            document.getElementById('date').valueAsDate= info.start;
            document.getElementById('start_hour').valueAsDate = info.start;
            document.getElementById('end_hour').valueAsDate = info.end;

            window.startDate = info.startStr;
            window.endDate = info.endStr;
        }
    });
    calendar.render();
    $("#addEvent-form").submit(function(e){
        e.preventDefault();
        var form = $("#addEvent-form")[0];
        var data = new FormData(form);

        data.set("fechaReservada",window.startDate.toLocaleString().replace("T", " ").replace("Z", ""));
        console.debug(window.startDate);
        data.set("horaInicio",window.startDate.toLocaleString().replace("T", " ").replace("Z", ""));
        data.set("horaFin",window.endDate.toLocaleString().replace("T", " ").replace("Z", ""));
        $.ajax({
            url: "/api/reservations/new",
            type: "POST",
            data: data,
            processData: false,
            contentType: false
        }).done(function(){
            alert("Data sent!");
        })
    })
});

function load(){
    var clients = $("#client");
    var places = $("#place");
    var packages = $("#packages");
    $.ajax({
        url: "/api/clients",
        type: "GET"
    }).done(function(data){
        $.each(data, function(){
            //string = "<option value = '" +this['idLocal'] +"'">+ "Calle" + this['calle'] + "Colonia" + this['colonia'] + "Ciudad" + this['ciudad'] "</option>";
            clients.append($('<option>',{
                value: this['idCliente'],
                text: this['nombre'] + " " + this['apellido']
            }));
        });
    });
    $.ajax({
        url: "/api/places",
        type: "GET"
    }).done(function(data){
        $.each(data, function(){
            //string = "<option value = '" +this['idLocal'] +"'">+ "Calle" + this['calle'] + "Colonia" + this['colonia'] + "Ciudad" + this['ciudad'] "</option>";
            places.append($('<option>',{
                value: this['idLocal'],
                text: "Calle: " + this['calle'] + " Colonia: " + this['colonia'] + " Ciudad: " + this['ciudad']
            }));
        });
    });
    $.ajax({
        url: "/api/packages",
        type: "GET"
    }).done(function(data){
        $.each(data, function(){
            //string = "<option value = '" +this['idLocal'] +"'">+ "Calle" + this['calle'] + "Colonia" + this['colonia'] + "Ciudad" + this['ciudad'] "</option>";
            packages.append($('<option>',{
                value: this['idPaquete'],
                text: this['descripcion']
            }));
        });
    });
}