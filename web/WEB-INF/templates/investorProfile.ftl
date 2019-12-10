<#include 'header.ftl'>
<#include 'libraries.ftl'>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <title>Личный кабинет</title>

    <link rel="stylesheet" href="css/bootstrap.css">
    <link rel="stylesheet" href="stylesheets/StartuperProfile.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <a class="navbar-brand" href="#">Название</a>
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
                        ${user.name} ${investor.surname}
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
        <h2>${user.name} ${investor.surname}</h2>
        <h4>${investor.country}</h4>
        <h4>${investor.budget}</h4>
        <div class="info">
            <h5><span>Email: </span>${user.login}</h5>
        </div>
        <button class="btn btn-sm edit-profile_btn">Редактровать профиль</button>
    </div>

    <div class="my-contests">
        <div class="container">
            <div class="row section-header">
                <div class="mr-auto">
                    <h2 class="h2">Мои инвестиционные проекты</h2>
                </div>
                <div class="ml-auto">
                    <button class="btn add-project" type="button" data-toggle="modal" data-target="#newContest">
                        Добавить
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
                <th class="text-center" scope="col">Сумма</th>
                <th scope="col">Заявок</th>
                <th scope="col">Статус</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td class="project-name"><a href="ContestDetail.html">Название 1</a></td>
                <td>Медицина</td>
                <td>Описание 1</td>
                <td class="text-center">300 000$</td>
                <td>33</td>
                <td>Идет</td>
            </tr>
            <tr>
                <th scope="row">1</th>
                <td class="project-name"><a href="ContestDetail.html">Название 1</a></td>
                <td>Все</td>
                <td>Описание 1</td>
                <td class="text-center">300 000$</td>
                <td>12</td>
                <td>Закончен</td>
            </tr>
            <tr>
                <th scope="row">1</th>
                <td class="project-name"><a href="ContestDetail.html">Название 1</a></td>
                <td>Блокчейн</td>
                <td>Описание 1</td>
                <td class="text-center">3 000 000$</td>
                <td>45</td>
                <td>Закончен</td>
            </tr>
            </tbody>
        </table>
    </div>

    <!--История инвестиции-->
    <div class="my-investments">
        <div class="container">
            <div class="row section-header">
                <div class="mr-auto">
                    <h2 class="h2">Мои инвестиции</h2>
                </div>
            </div>
        </div>

        <table class="table">
            <thead class="thead-light">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Название стартапа</th>
                <th scope="col">Дата</th>
                <th scope="col">Сумма</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td class="project-name"><a href="StartupDetail.html">Название 1</a></td>
                <td>17.11.2019</td>
                <td>100000$</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td class="project-name"><a href="#">Название 2</a></td>
                <td>17.11.2019</td>
                <td>100000$</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td class="project-name"><a href="#">Название 3</a></td>
                <td>17.11.2019</td>
                <td>100000$</td>
            </tr>
            </tbody>
        </table>
    </div>

</div>

<div class="modal fade" id="newContest" tabindex="-1" role="dialog" aria-labelledby="newContest"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="newContestTitle">Новая просьба о помощи</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <div class="form-inline">
                            <label for="slotsInput" class="mr-2">Количество мест</label>
                            <input type="text" class="form-control" id="slotsInput" placeholder="Мест всего">
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="form-inline">
                            <label for="countInput" class="mr-2">Сумма инвестиций</label>
                            <input type="text" class="form-control" id="countInput" placeholder="сумма">
                            <select name="currency" id="currencySelect" class="form-control">
                                <option>₽</option>
                                <option>$</option>
                                <option>&#8364</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group">
                        <div class="form-inline">
                            <label for="categorySelect">Категория (необязательно)</label>
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
                        <label for="exampleFormControlTextarea1">Опишите требования к кандидату</label>
                        <textarea class="form-control" id="exampleFormControlTextarea1" rows="3"></textarea>
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
<script src="https://use.fontawesome.com/e63e3b96a5.js"></script>
</body>
</html>

