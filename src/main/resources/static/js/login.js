let chartHandler;

$(document).ready(() => {

    $("#submitButton").click(loginMethod);
    $("#loginInput").keyup((event) => {
        if (event.keyCode === 13) {
            loginMethod();
        }
    });
});

function loginMethod() {
    let text = getInput($("#loginInput"), true);
    let col = getInput($("#passwordInput"), true);
    if (text.length === 0) {
        return;
    }

    $.ajax({
        type: "POST",
        contentType: "application/json",
        url: "loginCheck",
        data: JSON.stringify({loginId: text,password: col}),
        success: () => {
       location.href =  "http://localhost:8080/home";
        },
        error: jqXHR => {
            switch (jqXHR.status) {
                case 400:
                    showAlert(false, messages.INCORRECT_LOGIN_CRENDENTIAL);
                    break;
                case 403:
                    showAlert(false, 'Please Sign-up,Entered User id/Name not found');
                    break;
                case 406:
                    showAlert(false, 'Please Sign-up,Entered User id/Name not found');
                    break;
                case 417:
                	showAlert(false, 'Please Sign-up,Entered User id/Name not found');
                	break;
            }
        }
    });
}
