<#include 'header.ftl'>
<#include 'libraries.ftl'>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Contest detail</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">
    <link rel="stylesheet" href="stylesheets/ContestDetail.css">
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <a class="navbar-brand" href="MainPage.html">Название</a>
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
                        Имя Фамилия
                    </button>
                    <div class="dropdown-menu dropdown-menu-right">
                        <a href="StartuperProfile.html">
                            <button class="dropdown-item" type="button">Профиль</button>
                        </a>
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
    <div class="contest-info container">
        <h2><u>Название проекта</u></h2>
        <h4>Категории стартапов</h4>
        <p>Перечисление категорий</p>
        <div class="info">
            <h5><span class="font-weight-bold title">Дата окончания: </span>(Какая-то дата)</h5>
            <h5><span class="font-weight-bold title">Победитель:</span> Пусто, если еще идет</h5>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4 col-8">
                <select class="form-control" id="contest-winner">
                    <option>Победитель</option>
                    <option>Название 1</option>
                    <option>Название 2</option>
                    <option>Название 3</option>
                    <option>Название 4</option>
                    <option>Название 5</option>
                    <option>Название 6</option>
                </select>
            </div>
            <div class="col-md-4 col-4">
                <button class="btn btn-success">Выбрать</button>
            </div>
        </div>
    </div>

    <div class="requests">
        <div class="container">
            <div class="row section-header">
                <div class="mr-auto">
                    <h2 class="h2">Заявки</h2>
                </div>
            </div>
        </div>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Название</th>
                <th scope="col">Дата</th>
                <th scope="col">Категория</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>Материальная 1</td>
                <td>Категория 1</td>
                <td>Категория 1</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td class="project-name"><a href="#">Название 2</a></td>
                <td>Категория 2</td>
                <td>Категория 2</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td class="project-name"><a href="#">Название 3</a></td>
                <td>Категория 3</td>
                <td>Категория 3</td>
            </tr>
            </tbody>
        </table>
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