<#include 'header.ftl'>
<#include 'libraries.ftl'>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../../front/css/style.css" type="text/css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
          integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <title>Sign up</title>
</head>
<body class="photo">
<@header/>

<section class="wrapper-section">
    <div class="container-fluid ml-auto my-auto wrapper">
        <div class="forms-container ">
            <h1>Регистрация</h1>
            <form class="container" action="sign_up" method="post" enctype="multipart/form-data">
                <form>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon1"><i class="fa fa-user"
                                                                            aria-hidden="true"></i></span>
                        </div>
                        <input type="text" class="form-control" placeholder="Имя" aria-label="name"
                               aria-describedby="basic-addon1">
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon2"><i class="fa fa-user"
                                                                            aria-hidden="true"></i></span>
                        </div>
                        <input type="text" class="form-control" placeholder="Фамилия" aria-label="surname"
                               aria-describedby="basic-addon1">
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                        <span class="input-group-text" id="basic-addon3"><i class="fa fa-user"
                                                                            aria-hidden="true"></i></span>
                        </div>
                        <input type="number" class="form-control" placeholder="Телефон" aria-label="phone"
                               aria-describedby="basic-addon1">
                    </div>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <label class="input-group-text" for="inputGroupSelect01">Я </label>
                        </div>
                        <select class="custom-select" id="inputGroupSelect01">
                            <option selected value="1">Стартапер</option>
                            <option value="2">Инвестор</option>
                            <option value="3">Разработчик</option>
                        </select>
                    </div>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon4">@</span>
                        </div>
                        <input type="email" class="form-control" id="email" placeholder="Email" aria-describedby="emailHelp"
                               aria-label="Email"
                               aria-describedby="basic-addon1">
                    </div>
                    <div id="mailErr" style="display: none;padding: 5px;  color:red;"> Неправильный формат почты</div>

                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon5"><i class="fa fa-lock" aria-hidden="true"></i></span>
                        </div>
                        <input type="password" class="form-control" id="password" placeholder="Пароль" aria-label="Password"
                               aria-describedby="basic-addon1" name="password">
                    </div>
                    <div id="passErr" style="display: none;padding: 5px; color:red;"> Пароль должен состоять из букв латинского алфавита,
                        содержать хотя-бы одно число и быть длинной больше 6 символов</div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon6"><i class="fa fa-lock" aria-hidden="true"></i></span>
                        </div>
                        <input type="password" class="form-control" id="passwordConfirm" placeholder="Повторите пароль" aria-label="password confirm"
                               aria-describedby="basic-addon1">
                    </div>
                    <span id="passwordError"></span>
                    <button class="btn btn-lg signup-btn" id="register" type="submit">Регистрация</button>
                    <input type="submit" class="btn btn-lg signup-btn" value="Зарегистрироваться">
                    <a href="#signin-modal" data-toggle="modal">У меня уже есть профиль</a>
                </form>
            </form>
        </div>
    </div>
</section>

<div class="modal fade" id="signin-modal" tabindex="-1" role="dialog" aria-labelledby="signin-modal_label"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="exampleModalLabel">Вход</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form class="container" action="sign_up"  method="post">
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon7">@</span>
                        </div>
                        <input type="email" class="form-control" placeholder="Email" aria-describedby="emailHelp"
                               aria-label="Email"
                               aria-describedby="basic-addon1">
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon8">
                                <i class="fa fa-lock" aria-hidden="true"></i>
                            </span>
                        </div>
                        <input type="password" class="form-control" placeholder="Пароль" aria-label="Password"
                               aria-describedby="basic-addon1">
                    </div>
                    <div class="mr-auto">
                        <input type="checkbox" aria-label="Checkbox for following text input" id="rememberMe">
                        <label class="form-check-label" for="rememberMe">
                            Запомнить меня
                        </label>
                    </div>
                    <div class="ml-auto">
                        <a href="#">Не помню пароль</a>
                    </div>
                </form>
            </div>
            <div class="modal-footer">
                <button class="btn btn-md signin-btn">Войти</button>
                <a href="Registration.html.html">Создать профиль</a>
            </div>
        </div>
    </div>
</div>
<@lib/>
</body>
</html>