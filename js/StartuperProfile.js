$(document).ready(function(){

    const uploadFileForm =  $('#uploadFile');
    const textAreaForm = $('#area');

    $("select#selectMethod").change(function(){

        var selectedMethod = $(this).children("option:selected").val();

        if (selectedMethod === "Загурзить файл") {

            uploadFileForm.toggle();
            textAreaForm.hide();

        } else if (selectedMethod === "Текст"){

            textAreaForm.toggle();
            uploadFileForm.hide();
        } else {

            textAreaForm.hide();
            uploadFileForm.hide();
        }
    });
});

var visible = true;

function toogleDiv() {
    if (visible) {
        $('#inputCost').hide();
        visible = false;
    } else {
        $('#inputCost').show();
        visible = true;
    }
}