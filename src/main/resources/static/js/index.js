(function ($) {
    "use strict";
    function initHeader() {
        $(window).scroll(function() {
            let nav = $(".navbar")
            if (nav.offset().top > 10)  {
                nav.addClass("bg-white").addClass("border bottom");
                nav.removeClass("no-border");
                $(".nav-right li span, .nav-right li i").removeClass("text-white").addClass("text-dark");
                $(".logo-white").addClass("d-none");
                $(".logo-dark").removeClass("d-none");
            } else {
                nav.addClass("no-border");
                nav.removeClass("bg-white").removeClass("border bottom");
                $(".nav-right li span, .nav-right li i").removeClass("text-dark").addClass("text-white")
                $(".logo-white").removeClass("d-none");
                $(".logo-dark").addClass("d-none");
            }
        });
    }
    function init() {
        initHeader();
    }
    init();
})(jQuery);
