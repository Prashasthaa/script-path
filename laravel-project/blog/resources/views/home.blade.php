<x-message-banner msg="User Login Successfully" class="success"/>
<x-message-banner msg="User signUp Successfully" class="success"/>

<br>
<br>
<br>
<br>
<x-message-banner msg="Password Not correct please try again" class="error"/>
<x-message-banner msg="warning" class="warning"/>
<h1>Home page</h1>


<style>
   .success{
      background:lightgreen;
      color:green;
      padding: 3px 10px;
      border-radius:2px;
      display:inline-block;
      margin:10px;
}
.error{
      background:#f8d7da;
      color:red;
      padding: 3px 10px;
      border-radius:2px;
      display:inline-block;
      margin:10px;
}
.warning{
      background: #fff3cd;
      color:#856404;
      padding: 3px 10px;
      border-radius:2px;
      display:inline-block;
      margin:10px;
}
</style>