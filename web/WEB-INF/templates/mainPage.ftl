
<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link rel="stylesheet" href="../../front/css/style.css" type="text/css">
    <link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.3.1/css/all.css"
          integrity="sha384-mzrmE5qonljUremFsqc01SB46JvROS7bZs3IO2EmfFsd15uHvIt+Y8vEf7N7fWAU" crossorigin="anonymous">
    <title>Main</title>
</head>
<body>
<@header/>
<nav class="navbar navbar-expand-lg navbar-light bg-light fixed-top">
    <a class="navbar-brand" href="#">Business</a>
    <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent"
            aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <div class="collapse navbar-collapse " id="navbarSupportedContent">
        <ul class="navbar-nav ml-auto">
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
        </ul>
        <div class="auth-buttons">
            <button class="btn my-2 my-sm-2 nav-button auth-button_signin" type="submit" data-toggle="modal"
                    data-target="#signin-modal">Вход
            </button>
            <a href="Registration.html">
                <button class="btn my-2 my-sm-2 nav-button auth-button_signup" type="submit">Регистрация</button>
            </a>
        </div>
    </div>
</nav>

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
                <div class="container">
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon1">@</span>
                        </div>
                        <input type="email" class="form-control" placeholder="Email" aria-describedby="emailHelp"
                               aria-label="Email"
                               aria-describedby="basic-addon1">
                    </div>
                    <div class="input-group mb-3">
                        <div class="input-group-prepend">
                            <span class="input-group-text" id="basic-addon2">
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
                </div>
            </div>
            <div class="modal-footer">
                <a href="StartuperProfile.html"><button class="btn btn-md signin-btn">Войти</button></a>
                <a href="Registration.html">Создать профиль</a>
            </div>
        </div>
    </div>
</div>

<div class="container-fluid greetings-section">
    <div class="container">
        <h1 class="text-center title">Инвестируйте в выдающиеся стартапы, находите
            инвестиции для своего бизнеса, вовлекайте в свои идеи лучших
            профессионалов</h1>
        <div class="actions text-center row">
            <div class="col-sm-12 col-md-4">
                <a href="#startups">
                    <button class="btn action">Инвестировать</button>
                </a>
            </div>
            <div class="col-sm-12 col-md-4">

                <a href="#investments">
                    <button class="btn action">Найти инвестиции</button>
                </a>
            </div>
            <div class="col-sm-12 col-md-4">

                <a href="#jobs">
                    <button class="btn action">Найти работу</button>
                </a>
            </div>
        </div>
    </div>
</div>

<div class="container" id="startups">
    <div class="row section-header">
        <div class="col-sm-2">
            <h2 class="h2">Стартапы</h2>
        </div>
        <div class="ml-auto">
            <button class="btn btn-lg add-project_btn">Добавить проект</button>
        </div>
    </div>
    <div class="card-deck">
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">Название стартапа</h5>
                    <p class="card-text">Небольшое описание.</p>
                </div>
            </a>
        </div>
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">Название стартапа</h5>
                    <p class="card-text">Небольшое описание.</p>
                </div>
            </a>
        </div>
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">Название стартапа</h5>
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores eos
                        molestias mollitia tempora! Aliquam aliquid autem corporis cupiditate dolores excepturi itaque
                        iure magnam maiores nesciunt quibusdam quisquam reprehenderit, repudiandae voluptas.</p>
                </div>
            </a>
        </div>
    </div>
    <div class="text-center">
        <button class="btn btn-lg look-all">Смотреть все</button>
    </div>
</div>

<div class="container" id="investments">
    <div class="row section-header">
        <div class="col-sm-6">
            <h2 class="h2">Инвестиционные проекты</h2>
        </div>
        <div class="ml-auto">
            <button class="btn btn-lg add-project_btn">Добавить проект</button>
        </div>
    </div>
    <div class="card-deck">
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">Название стартапа</h5>
                    <p class="card-text">Небольшое описание.</p>
                </div>
            </a>
        </div>
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">Название стартапа</h5>
                    <p class="card-text">Небольшое описание.</p>
                </div>
            </a>
        </div>
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">Название стартапа</h5>
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores eos
                        molestias mollitia tempora! Aliquam aliquid autem corporis cupiditate dolores excepturi itaque
                        iure magnam maiores nesciunt quibusdam quisquam reprehenderit, repudiandae voluptas.</p>
                </div>
            </a>
        </div>
    </div>
    <div class="text-center">
        <button class="btn btn-lg look-all">Смотреть все</button>
    </div>
</div>

<div class="container" id="jobs">
    <div class="row section-header">
        <div class="col-sm-6">
            <h2 class="h2">Актуальные вакансии</h2>
        </div>
        <div class="ml-auto">
            <button class="btn btn-lg add-project_btn">Добавить вакансию</button>
        </div>
    </div>
    <div class="card-deck">
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">iOS разработчик</h5>
                    <h4>Название стартапа</h4>
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores eos
                        molestias mollitia tempora! Aliquam aliquid autem corporis cupiditate dolores excepturi itaque
                        iure magnam maiores nesciunt quibusdam quisquam reprehenderit, repudiandae voluptas.</p>
                </div>
                <div class="card-footer">
                    <small class="text-muted">Казань</small>
                </div>
            </a>
        </div>
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">iOS разработчик</h5>
                    <h4>Название стартапа</h4>
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores eos
                        molestias mollitia tempora! Aliquam aliquid autem corporis cupiditate dolores excepturi itaque
                        iure magnam maiores nesciunt quibusdam quisquam reprehenderit, repudiandae voluptas.</p>
                </div>
            </a>
            <div class="card-footer">
                <small class="text-muted">Казань</small>
            </div>
        </div>
        <div class="card" style="width: 22rem;">
            <a href="#" class="card-link">
                <div class="card-header"></div>
                <div class="card-body">
                    <h5 class="card-title">iOS разработчик</h5>
                    <h4>Название стартапа</h4>
                    <p class="card-text">Lorem ipsum dolor sit amet, consectetur adipisicing elit. Asperiores eos
                        molestias mollitia tempora! Aliquam aliquid autem corporis cupiditate dolores excepturi itaque
                        iure magnam maiores nesciunt quibusdam quisquam reprehenderit, repudiandae voluptas.</p>
                </div>
            </a>
            <div class="card-footer">
                <small class="text-muted">Казань</small>
            </div>
        </div>
    </div>
    <div class="text-center">
        <button class="btn btn-lg look-all">Смотреть все</button>
    </div>
</div>

<footer class="footer mt-auto py-3 bg-light">
    <div class="container">
        <div class="row">
            <div class="col-sm-6">
                <h1>Название</h1>
            </div>
        </div>
    </div>
</footer>
<@lib/>
</body>
</html>