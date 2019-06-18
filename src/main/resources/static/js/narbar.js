//导航条的JS
$("nav>div").css("left", function (i) {
        return i * 220;
    }
);
$("nav>div").click(function () {
    var th:href = $(this).children().eq(0).attr("th:href");
    $(window).attr("location", th:href);
});
