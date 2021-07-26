$(function() {

  $(document).ready(function() {

    $("#myBtn").click(function() {
      $("#myModal").css({
        "display": "block"
      });
    });

    $(".close").click(function() {
      $("#myModal").css({
        "display": "none"
      });
    });

    $("html").click(function(event) {
      if (event.target.id === "myModal") {
        $("#myModal").css({
          "display": "none"
        });
      }
    });

  });

})

$(function() {

  $(document).ready(function() {

    $("#myBtn2").click(function() {
      $("#myModal2").css({
        "display": "block"
      });
    });

    $(".close").click(function() {
      $("#myModal2").css({
        "display": "none"
      });
    });

    $("html").click(function(event) {
      if (event.target.id === "myModal") {
        $("#myModal2").css({
          "display": "none"
        });
      }
    });

  });

})