<#include 'header.ftl'>
<#include 'libraries.ftl'>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">

    <link rel="stylesheet" href="../../front/css/style.css" type="text/css">
    <script type="text/javascript" src="http://ajax.googleapis.com/ajax/libs/jquery/1.4/jquery.min.js"></script>
    <script type="text/javascript">
        // $(document).ready(function () {
        //     $('.delete').click(function () {
        //         var name = $(this).attr('name');
        //         $.ajax({
        //             type: "post",
        //             url: "/delete",
        //             data: {
        //                 "helpertable_id": name
        //             },
        //             success: function () {
        //                 $('#' + name).fadeOut();
        //             }
        //         });
        //     });
        // });
    </script>
    <title>Profile</title>
</head>
<body>
<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <a class="navbar-brand" href="#">Business</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse " id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto mr-2">
            <li class="nav-item">
                <a href="#jobs">
                    <button class="btn nav-button">Вакансии</button>
                </a>
            </li>
            <li class="nav-item">
                <a href="#startups">
                    <button class="btn nav-button">Стартапы</button>
                </a>
            </li>
            <li class="nav-item ">
                <div class="btn-group">
                    <button type="button" class="btn dropdown-toggle nav-button" data-toggle="dropdown"
                            aria-haspopup="true" aria-expanded="false">
                        ${user.name} ${startuper.surname}
                    </button>
                    <div class="dropdown-menu dropdown-menu-right">
                        <button class="dropdown-item" type="button">Профиль</button>
                        <button class="dropdown-item" type="button">Добавить (стартап/инвестиционный проект/резюме)
                        </button>
                        <button class="dropdown-item" type="button">Выход</button>
                    </div>
                </div>
            </li>
        </ul>
    </div>
</nav>

<div class="container">

    <div class="user-info container">
        <h2 id="username"></b>${user.name}</h2>
        <h4></b>${startuper.country}</h4>
        <div class="info">
            <h5>79991553468</h5>
            <h5>mail@mail.ru</h5>
        </div>
        <button class="btn btn-sm edit-profile_btn">Редактровать профиль</button>
    </div>

    <div class="projects">
        <div class="container">
            <div class="row section-header">
                <div class="col-sm-4">
                    <h2 class="h2">Мои проекты</h2>
<#--                    <#list projects as p></#list>-->
                </div>
                <div class="ml-auto">
                    <button class="btn add-project" type="button" data-toggle="modal" data-target="#newProject">Добавить
                        проект
                    </button>
                </div>
            </div>
        </div>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Название</th>
                <th scope="col">Категория</th>
                <th scope="col">Описание</th>
                <th class="text-center" scope="col">Сотрудников</th>
                <th scope="col">Статус реализации</th>
                <th scope="col">Нужна поддержка</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td class="project-name"><a href="StartupDetail.html">Название 1</a></td>
                <td>Категория 1</td>
                <td>Описание 1</td>
                <td class="text-center">3</td>
                <td>В разработке</td>
                <td>Нет</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td class="project-name"><a href="#">Название 2</a></td>
                <td>Категория 2</td>
                <td>Описание 2</td>
                <td class="text-center">6</td>
                <td>Готово</td>
                <td>Да (финансы)</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td class="project-name"><a href="#">Название 3</a></td>
                <td>Категория 3</td>
                <td>Описание 3</td>
                <td class="text-center">10</td>
                <td>Есть идея</td>
                <td>Да (люди)</td>
            </tr>
            </tbody>
        </table>
    </div>
</div>

<div class="modal fade" id="newProject" tabindex="-1" role="dialog" aria-labelledby="newProject"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="newProjectTitle">Новая просьба о помощи</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <div class="form-inline">
                            <label for="projectName" class="mr-2">Название</label>
                            <input type="text" class="form-control" id="projectName" placeholder="Super startup"
                                   required>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="form-inline">
                            <label for="categorySelect" class="mr-2">Категория</label>
                            <select name="category" id="categorySelect" class="form-control">
                                <option>Выберите</option>
                                <option>Блокчейн</option>
                                <option>ИИ</option>
                                <option>Компьютерное зрение</option>
                                <option>Транспорт</option>
                                <option>Медиицина</option>
                                <option>Улучшение жизни</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="form-inline">
                            <label for="employeesCountSelect" class="mr-2">Сотрудников</label>
                            <select name="category" id="employeesCountSelect" class="form-control">
                                <option>1-5</option>
                                <option>6-15</option>
                                <option>16-30</option>
                                <option>Больше 30</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="form-inline">
                            <label for="statusSelect" class="mr-2">Статус реализации</label>
                            <select name="category" id="statusSelect" class="form-control">
                                <option>Есть идея</option>
                                <option>Есть наработки</option>
                                <option>В разработке</option>
                                <option>На стадии завершения</option>
                                <option>Готово</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group">
                        <div class="form-inline">
                            <label for="selectMethod" class="mr-2">Способ описания проекта</label>
                            <select name="category" id="selectMethod" class="form-control">
                                <option>Выберите способ</option>
                                <option>Загурзить файл</option>
                                <option>Текст</option>
                            </select>
                        </div>
                    </div>

                    <div class="form-group" id="uploadFile">
                        <label for="newAvatar">Загурзить файл</label>
                        <div class="custom-file">
                            <input type="file" class="custom-file-input" id="newAvatar">
                            <label class="custom-file-label" for="newAvatar">Выберите файл</label>
                        </div>
                    </div>
                    <div class="form-group" id="area">
                        <label for="descriptionArea">Описание</label>
                        <textarea class="form-control" id="descriptionArea" rows="3"></textarea>
                    </div>

                    <div class="form-group form-check">
                        <input type="checkbox" class="form-check-input" id="needHelpCheck" onclick="toogleDiv()" checked>
                        <label class="form-check-label" for="needHelpCheck">Нужны инвестиции</label>
                    </div>
                    <div class="form-group" id="inputCost">
                        <div class="form-inline">
                            <label for="countInput" class="mr-2">Размер</label>
                            <input type="text" class="form-control" id="countInput" placeholder="Размер инвестиций">
                            <select name="currency" id="currencySelect" class="form-control">
                                <option>$</option>
                                <option>₽</option>
                                <option>&#8364</option>
                            </select>
                        </div>
                    </div>
                </form>
            </div>

            <div class="modal-footer">
                <button type="button" class="btn btn-danger" data-dismiss="modal">Отмена</button>
                <button type="button" class="btn btn-success">Добавить</button>
            </div>
        </div>
    </div>
</div>

<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
        integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
        integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/StartuperProfile.js"></script>
<script src="https://use.fontawesome.com/e63e3b96a5.js"></script>

<@lib/>
</body>
</html>