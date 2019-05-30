$(document).ready(function () {
    loadManagers();

})

function loadManagers() {
    var tableBody = $('#managers_table > tbody');
    var html = '';
    $.ajax({
        url: "/api/managers",
        type: "GET"
    }).done(function (managers) {

        html += '<tr>' +
            '<td>' + managers.idEncargado + '</td>' +
            '<td>' + managers.nombre + '</td>' +
            '<td>' + managers.apellido + '</td>' +
            '<td>' + managers.numTelefono + '</td>' +
            '</tr>';

        $('#managers_table').DataTable();
    })

}