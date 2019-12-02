$(document).ready(function(){

    const investmentSizeForm =  $('#investmentSize');
    const requirementsForm = $('#requirements');

    $("select#helpKind").change(function(){

        var selectedCategory = $(this).children("option:selected").val();

        if (selectedCategory === "Рабочая сила") {

            requirementsForm.toggle();
            investmentSizeForm.hide();

        } else if (selectedCategory === "Финансы"){

            investmentSizeForm.toggle();
            requirementsForm.hide();
        } else {

            investmentSizeForm.hide();
            requirementsForm.hide();
        }
    });
});