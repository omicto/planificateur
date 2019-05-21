document.addEventListener('DOMContentLoaded', function () {
    var calendarEl = document.getElementById('general-calendar');

    var calendar = new FullCalendar.Calendar(calendarEl, {
        plugins: ['dayGrid', 'timeGrid'],
        events: '/eventos',
        header: {
            left:   'dayGridMonth,timeGridWeek,timeGridDay',
            center: 'title',
            right:  'today prev,next'
        }
    });

    calendar.render();
});