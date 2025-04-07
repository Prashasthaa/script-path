<div><x-message-banner msg="sucess"class="success"/></div>
<br>

<br>
<x-message-banner msg="warning" class="warning"/>
<h1>About page</h1>
<x-message-banner msg="error"class="error"/>

<style>
   .success {
    background: lightgreen;
    color: green;
    padding: 10px 15px;
    border-radius: 5px;
    margin-bottom: 10px;
    font-weight: bold;
    display: block;
}

.warning {
    background: #fff3cd;
    color: #856404;
    padding: 10px 15px;
    border-radius: 5px;
    margin-bottom: 10px;
    font-weight: bold;
    display: block;
}

.error {
    background: #f8d7da;
    color: #721c24;
    padding: 10px 15px;
    border-radius: 5px;
    margin-bottom: 10px;
    font-weight: bold;
    display: block;
}

</style>