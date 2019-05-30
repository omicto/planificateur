document.addEventListener('DOMContentLoaded', function () {
    var calendarEl = document.getElementById('general-calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
        plugins: ['interaction','dayGrid', 'timeGrid'],
        events: '/eventos',
        header: {
            left:   'dayGridMonth,timeGridWeek,timeGridDay',
            center: 'addEventButton, title',
            right:  'today prev,next'
        },
        customButtons: {
            addEventButton: {
                text: 'add event...',
                click: function () {

                }
            }
        },
        navLinks: true,
        selectable: true,
        select: function (info) {

        }
    });

    calendar.render();


});
