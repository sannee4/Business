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
    <title>Название стартапа</title>

</head>
<body>
<@header/>
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

    <div class="user-info container">
        <h2><u>Название стартапа</u></h2>
        <h4>Категория: безопасность</h4>
        <div class="info">
            <h5>Презентация: (Тут должен быть файл)</h5>
            <h5>Контактная информация: mail@mail.ru</h5>
        </div>
        <div class="form-row">
            <div class="form-group col-md-4 col-8">
                <select class="form-control" id="ready-status">
                    <option>Есть идея</option>
                    <option>В разработке</option>
                    <option>В процессе завершения разработки</option>
                    <option>Завершено</option>
                </select>
            </div>
            <div class="col-md-4 col-4">
                <button class="btn btn-success">Сохранить</button>
            </div>
        </div>
    </div>

    <div class="help-offers">
        <div class="container">
            <div class="row section-header">
                <div class="col-sm-8">
                    <h2 class="h2">Заявки на сотрудничество</h2>
                </div>
            </div>
        </div>
        <div class="list-group">
            <a href="#investor-info1" class="list-group-item list-group-item-action help-offer" data-toggle="collapse"
               role="button" aria-expanded="false" aria-controls="investor-info1">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1">ФИО инвестора: </h5>
                    <small class="ml-auto">3 дня назад</small>
                </div>
                <h5 class="mb-1">Сумма: 1000000$</h5>
                <div class="col">
                    <div class="collapse multi-collapse" id="investor-info1">
                        <div class="card card-body">
                            <h6>Email: mardanovamir0@gmail.com</h6>
                            <h6>Телефон: 79991553468</h6>
                            <p>
                                <button class="btn btn-sm btn-success">Принять</button>
                                <button class="btn btn-sm btn-danger">Отклонить</button>
                            </p>
                        </div>
                    </div>
                </div>
            </a>
            <a href="#investor-info2" class="list-group-item list-group-item-action help-offer" data-toggle="collapse"
               role="button" aria-expanded="false" aria-controls="investor-info2">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1">ФИО инвестора: </h5>
                    <small class="ml-auto">3 дня назад</small>
                </div>
                <h5 class="mb-1">Сумма: </h5>
                <div class="col">
                    <div class="collapse multi-collapse" id="investor-info2">
                        <div class="card card-body">
                            <h6>Email: mardanovamir0@gmail.com</h6>
                            <h6>Телефон: 79991553468</h6>
                            <p>
                                <button class="btn btn-sm btn-success">Принять</button>
                                <button class="btn btn-sm btn-danger">Отклонить</button>
                            </p>
                        </div>
                    </div>
                </div>
            </a>
            <a href="#investor-info3" class="list-group-item list-group-item-action help-offer" data-toggle="collapse"
               role="button" aria-expanded="false" aria-controls="investor-info3">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1">ФИО инвестора: </h5>
                    <small class="ml-auto">3 дня назад</small>
                </div>
                <h5 class="mb-1">Сумма: </h5>
                <div class="col">
                    <div class="collapse multi-collapse" id="investor-info3">
                        <div class="card card-body">
                            <h6>Email: mardanovamir0@gmail.com</h6>
                            <h6>Телефон: 79991553468</h6>
                            <p>
                                <button class="btn btn-sm btn-success">Принять</button>
                                <button class="btn btn-sm btn-danger">Отклонить</button>
                            </p>
                        </div>
                    </div>
                </div>
            </a>
        </div>
    </div>

    <div class="help-requests">
        <div class="container">
            <div class="row section-header">
                <div class="col-sm-6">
                    <h2 class="h2">Мои запросы помощи</h2>
                </div>
                <div class="ml-auto">
                    <button class="btn add-offer" type="button" data-toggle="modal" data-target="#newRequestModal">
                        Добавить просьбу
                    </button>
                </div>
            </div>
        </div>
        <table class="table">
            <thead class="thead-light">
            <tr>
                <th scope="col">#</th>
                <th scope="col">Тип</th>
                <th scope="col">Количество</th>
                <th scope="col">Статус</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <th scope="row">1</th>
                <td>Материальная 1</td>
                <td>Категория 1</td>
                <td>Актуально</td>
            </tr>
            <tr>
                <th scope="row">2</th>
                <td class="project-name"><a href="#">Название 2</a></td>
                <td>Категория 2</td>
                <td>Актуально</td>
            </tr>
            <tr>
                <th scope="row">3</th>
                <td class="project-name"><a href="#">Название 3</a></td>
                <td>Категория 3</td>
                <td>Неактуально</td>
            </tr>
            </tbody>
        </table>
    </div>

    <div class="accepted-investments">
        <div class="container">
            <div class="row section-header">
                <div class="mr-auto">
                    <h3>Полученные инвестиции</h3>
                </div>
            </div>
        </div>
        <div class="list-group">
            <div class="list-group-item contest">
                <div class="d-flex w-100 justify-content-between">
                    <a href="InvestorPage.html"><h5 class="mb-1">ФИО инвестора / название компании</h5></a>
                    <small>Дата</small>
                </div>
                <b><h4 class="mb-1">Сумма </h4></b>
            </div>
        </div>
    </div>

    <div class="contests">
        <div class="container">
            <div class="row section-header">
                <div class="mr-auto">
                    <h3>Конкурсы на получение инвестиций</h3>
                </div>
            </div>
        </div>
        <div class="list-group">
            <div class="list-group-item contest">
                <div class="d-flex w-100 justify-content-between">
                    <a href="InvestorPage.html"><h5 class="mb-1">ФИО инвестора / название компании</h5></a>
                    <small>Дата публикации</small>
                </div>
                <h6 class="mb-1">Сумма </h6>
                <button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#detailModal">
                    Подробнее
                </button>
                <button class="btn btn-success btn-sm">Отправить заявку</button>
            </div>
        </div>
        <div class="text-center">
            <button class="btn btn-lg look-all">Смотреть все</button>
        </div>
    </div>

    <div class="competitors">
        <div class="container">
            <div class="row section-header">
                <div class="col-sm-8">
                    <h2 class="h2">Конкуренты</h2>
                </div>
            </div>
        </div>
        <div class="list-group">
            <a href="#competitor-info1" class="list-group-item list-group-item-action competitor" data-toggle="collapse"
               role="button" aria-expanded="false" aria-controls="competitor-info1">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1">Название стартапа</h5>
                </div>
                <h6 class="mb-1">Паспорт проекта </h6>
            </a>
            <a href="#competitor-info2" class="list-group-item list-group-item-action competitor" data-toggle="collapse"
               role="button" aria-expanded="false" aria-controls="competitor-info2">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1">Название стартапа</h5>
                </div>
                <h6 class="mb-1">Паспорт проекта </h6>
            </a>
            <a href="#competitor-info3" class="list-group-item list-group-item-action competitor" data-toggle="collapse"
               role="button" aria-expanded="false" aria-controls="competitor-info3">
                <div class="d-flex w-100 justify-content-between">
                    <h5 class="mb-1">Название стартапа</h5>
                </div>
                <h6 class="mb-1">Паспорт проекта </h6>
            </a>
        </div>
    </div>

</div>

<!-- Modal new Request -->
<div class="modal fade" id="newRequestModal" tabindex="-1" role="dialog" aria-labelledby="newRequestModal"
     aria-hidden="true">
    <div class="modal-dialog modal-dialog-centered" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="newRequestModalTitle">Новая просьба о помощи</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <form>
                    <div class="form-group">
                        <div class="form-inline">
                            <label for="helpKind" class="mr-2">Мне нужно</label>
                            <select id="helpKind" class="form-control">
                                <option>Выберите</option>
                                <option>Рабочая сила</option>
                                <option>Финансы</option>
                            </select>
                        </div>
                    </div>
                    <div class="form-group" id="investmentSize">
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
                    <div class="form-group" id="requirements">
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

<div class="modal fade" id="detailModal" tabindex="-1" role="dialog" aria-labelledby="detailModalTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="detailModalTitle">Отправить заявку на конкурс</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <h4><a href="InvestorPage.html">Организатор</a></h4>
                <h3><u>Описание:</u></h3>
                <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Amet blanditiis expedita officiis porro
                    possimus quam quos reiciendis rem, reprehenderit similique sint tenetur vel voluptas voluptates
                    voluptatum. Adipisci asperiores cumque cupiditate magnam odit, provident sed. Autem, culpa
                    cupiditate ducimus fugit in nihil nulla reprehenderit tempora. Aliquid ipsam libero natus! Animi
                    assumenda at, autem cum, error fugiat iusto laudantium nam nemo, porro provident qui sed voluptate!
                    Accusamus animi autem facere nulla odio praesentium sapiente tempora tempore. Ad, aliquam amet at
                    aut consequuntur cupiditate deserunt dolor dolorum, earum exercitationem iusto minus nam natus neque
                    porro quaerat quam, quia reiciendis sit temporibus! Amet at cumque distinctio ducimus earum eligendi
                    eveniet facere fuga incidunt inventore ipsa ipsum laboriosam minus necessitatibus nesciunt nobis
                    officia, pariatur perspiciatis, quae, quam quas qui quia recusandae sed suscipit unde voluptas
                    voluptatum. Accusantium ad, aliquam animi aperiam asperiores delectus dolore doloribus saepe sed
                    sequi. Eligendi expedita quis sunt? Adipisci animi aut commodi consequatur delectus dolor et
                    excepturi fugiat harum illo incidunt ipsa maxime mollitia nam nemo nesciunt non nulla placeat
                    possimus quam quo soluta, voluptas voluptatem! A, accusamus debitis dolores ducimus eos
                    exercitationem expedita fugit magnam maiores nam, nesciunt nostrum officiis pariatur placeat quasi
                    quidem, quis recusandae unde vel veritatis voluptatem.</p>

            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-secondary" data-dismiss="modal">Закрыть</button>
                <button type="button" class="btn btn-outline-success">Отправить заявку</button>
            </div>
        </div>
    </div>
</div>
<@lib/>
</body>
</html>