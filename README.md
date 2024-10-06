<body>

<h1>Лабораторная работа №1: Создание Activity и передача параметров между ними</h1>

<p><strong>Выполнил:</strong> Золотарев Павел</p>
<p><strong>Язык программирования:</strong> Java</p>

<h2>Описание</h2>

<p>Приложение состоит из двух экранов и реализует передачу параметра с первого экрана на второй при нажатии кнопки.</p>

<h3>Внешний вид</h3>
<ul>
    <li><strong>Экран 1</strong> (MainActivity): 
        <ul>
            <li>Содержит кнопку "Перейти к Activity 2".</li>
            <li>При нажатии на кнопку выполняется переход на второй экран.</li>
        </ul>
    </li>
    <li><strong>Экран 2</strong> (SecondActivity): 
        <ul>
            <li>Отображает текст с переданным параметром: <strong>"Переданный параметр: Золотарев"</strong>.</li>
        </ul>
    </li>
</ul>

<h3>Процесс передачи параметра</h3>
<ol>
    <li>Пользователь нажимает кнопку на первом экране.</li>
    <li>Создается объект <code>Intent</code>, который указывает на второй экран (SecondActivity).</li>
    <li>В объект <code>Intent</code> добавляется параметр с ключом <code>PARAMETER_KEY</code>.</li>
    <li>Первый экран запускает второй с помощью метода <code>startActivity(intent)</code>.</li>
</ol>

<p><strong>Пример кода для MainActivity:</strong></p>
<pre>
<code>
btn1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra(PARAMETER_KEY, "Золотарев");
        startActivity(intent);
    }
});
</code>
</pre>

<ol start="5">
    <li>На втором экране (SecondActivity) извлекается переданный параметр из <code>Intent</code> и отображается в <code>TextView</code>.</li>
</ol>

<p><strong>Пример кода для SecondActivity:</strong></p>
<pre>
<code>
Intent intent = getIntent();
String parameterValue = intent.getStringExtra(PARAMETER_KEY);

</code>
</pre>

<h2>Как собрать проект?</h2>
<ol>
    <li>Откройте Android Studio.</li>
    <li>Скачайте или клонируйте проект из репозитория.</li>
    <li>Откройте проект в Android Studio: <code>File -> Open...</code> и выберите папку с проектом.</li>
    <li>Убедитесь, что все зависимости настроены правильно. Если необходимо, выполните синхронизацию Gradle.</li>
    <li>Для сборки проекта выберите: <code>Build -> Make Project</code>.</li>
    <li>Запустите проект на эмуляторе или подключенном устройстве, выбрав нужное устройство в списке и нажав на кнопку "Run".</li>
</ol>

</body>
