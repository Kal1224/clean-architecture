function saveUser(){

    let obj = $('#register').serializeJSON();
    let jsonString = JSON.stringify(obj);

    $.ajax({
        url: "/register",
        type: "post",
        data: jsonString,
        headers: { "X-Requested-With": "XMLHttpRequest" },
        contentType: 'application/json; charset=utf-8',
        success: function(result) {
            if (result.status <= 200) {
                alert('가입성공!');
                window.location.href = "/register";
            } else {
                alert(JS_MESSAGE[result.errorCode]);
                console.log("---- " + result.message);
            }
        },
        error: function() {
            alert(JS_MESSAGE["ajax.error.message"]);
        }
    });
}