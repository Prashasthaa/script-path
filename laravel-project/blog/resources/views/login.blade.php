<div>
    <h1>Login </h1>
    <form action="login" method="post">
    @csrf
        <input type="text" name="user" placeholder="Enter user name">
        <br><br>
        <input type="password" name="password" placeholder="Enter password">
        <br><br>
        <button>Login</button>
    </form>
</div>
