$(function() {
    $('#datetimepicker2').datetimepicker({
        format: 'L',
        useCurrent: false
    });
    $("#datetimepicker2").on("change.datetimepicker", function(e) {
        $('#datetimepicker1').datetimepicker('maxDate', e.date);
    });
});