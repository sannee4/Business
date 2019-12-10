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
    <title>Developer</title>

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
                        ${user.name} ${developer.surname}
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
    <div class="card mb-3 cv" style="max-width: 640px;">
        <div class="row no-gutters">
            <div class="col-md-8">
                <div class="card-body">
                    <h2>${user.name} ${developer.surname}</h2>
                    <h4>${developer.country}</h4>
                    <div class="info">
                        <div class="contacts">
                            <h5><span>Email: </span>${user.login}</h5>
                            <a href="https://github.com/omeeer78" class="btn show-git_btn" target="_blank"><h5>
                                    GitHub</h5></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

    <div class="accordion" id="resumeAccordion">
        <!-- Резюме -->
        <div class="card">
            <div id="showResume" class="collapse show" aria-labelledby="headingOne" data-parent="#resumeAccordion">
                <div class="card-body">
                    <h5><span>Профиль: </span> iOS разработка</h5>
                    <h5><span>Опыт работы: </span> 6 лет </h5>
                    <br>
                    <h4 class="font-weight-bold">Технологии</h4>

                    <ul class="list-group list-group-flush">
                        <li class="list-group-item">Swift 4/5</li>
                        <li class="list-group-item">AutoLayout/Autoresizing</li>
                        <li class="list-group-item">CoreData/UserDefaults/Realm</li>
                        <li class="list-group-item">Alamofire/URLSession</li>
                        <li class="list-group-item">Custom layouts</li>
                        <li class="list-group-item">MVC/MVP/VIPER/MVVM</li>
                        <li class="list-group-item">Custom transtitions</li>
                        <li class="list-group-item">GCD/OperationQueue</li>
                    </ul>
                </div>
                <button class="btn edit-profile_btn" type="button" data-toggle="collapse" data-target="#editForms"
                        aria-expanded="true" aria-controls="editForms">
                    Редактировать резюме
                </button>
            </div>
        </div>
        <!-- Изменение резюме -->
        <div class="card">
            <div id="editForms" class="collapse" aria-labelledby="headingTwo" data-parent="#resumeAccordion">
                <div class="card-body">
                    <form>
                        <div class="form-group">
                            <label for="newEmail">Новый email</label>
                            <input type="email" class="form-control" id="newEmail" placeholder="example@mail.com">
                        </div>
                        <div class="form-group">
                            <label for="devProfile">Профиль</label>
                            <input type="text" class="form-control" id="devProfile" placeholder="например iOS">
                        </div>
                        <div class="form-group">
                            <label for="newAvatar">Изменить фото профиля</label>
                            <div class="custom-file">
                                <input type="file" class="custom-file-input" id="newAvatar">
                                <label class="custom-file-label" for="newAvatar">Выберите файл</label>
                            </div>
                        </div>
                        <div class="form-group">
                            <label for="exampleFormControlSelect1">Опыт работы</label>
                            <select class="form-control" id="exampleFormControlSelect1">
                                <option>Без опыта, студент</option>
                                <option>1-2 года</option>
                                <option>3-4 лет</option>
                                <option>4-5 лет</option>
                                <option>более 5 лет</option>
                            </select>
                        </div>
                        <div class="form-group">
                            <label for="technologiesArea">Технологии, с которыми вы работаете</label>
                            <textarea class="form-control" id="technologiesArea"></textarea>
                        </div>
                        <div class="form-group">
                            <label for="aboutArea">Опишите себя</label>
                            <textarea class="form-control" id="aboutArea"></textarea>
                        </div>
                    </form>

                    <div class="form-inline">
                        <div class="action-buttons">
                            <button class="btn btn-success" type="button" data-toggle="collapse"
                                    data-target="#showResume"
                                    aria-expanded="true" aria-controls="editForms">
                                Сохранить
                            </button>
                            <button class="btn btn-danger" type="button" data-toggle="collapse"
                                    data-target="#showResume"
                                    aria-expanded="true" aria-controls="editForms">
                                Отменить
                            </button>
                        </div>
                    </div>

                </div>
            </div>
        </div>
    </div>

    <div class="jobs">
        <div class="list-group">
            <div class="list-group-item contest">
                <div class="d-flex w-100 justify-content-between">
                    <button class="btn btn-link" type="button" data-toggle="modal" data-target="#jobDetail">
                        <h5>Название позиции</h5>
                    </button>
                    <small>Дата публикации</small>
                </div>
                <a href="StartupDetail.html"><h6 class="mb-1">Название компании</h6></a>
                <h6 class="mb-1">зарплата </h6>
                <button class="btn btn-success btn-sm">Откликнуться</button>
            </div>
        </div>
    </div>

</div>

<div class="modal fade" id="jobDetail" tabindex="-1" role="dialog" aria-labelledby="jobDetailTitle"
     aria-hidden="true">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <h5 class="modal-title" id="jobDetailTitle">Отправить заявку на конкурс</h5>
                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                    <span aria-hidden="true">&times;</span>
                </button>
            </div>
            <div class="modal-body">
                <h4><a href="StartupDetail.html">Компания</a></h4>
                <h3><u>Зарплата:</u> не указана</h3>
                <h3><u>Описание вакансии:</u></h3>
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
                <button type="button" class="btn btn-outline-success">Откликнуться</button>
            </div>
        </div>
    </div>
</div>

<@lib/>
</body>
</html>