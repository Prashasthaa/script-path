<div>
    <h1>User form</h1>

    <form action="/user" method="post">
        <input type="hidden" name="_method"  value="delete">
        @csrf
        <input type="text" name="user" placeholder="Enter user name">
        <br><br>
        <input type="password" name="password" placeholder="Enter password">
        <br><br>
        <button>Submit</button>
    </form>
    <!-- Walk as if you are kissing the Earth with your feet. - Thich Nhat Hanh -->
</div>
