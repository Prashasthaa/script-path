<div>
    <h1> Add New User</h1>

    @if(session('message'))
<span class="success-message">{{session('message')}}</span>
@endif   

@if(session('name'))
<span class="success-message">{{session('nmae')}}</span>
@endif   

<form action="add" method="post">
        <!-- <input type="hidden" name="_method"  value="PUT"> -->
        @csrf
        <input type="text" name="username" placeholder="Enter user name">
        <br><br>
        <input type="text" name="email" placeholder="Enter user email">
        <br><br>
        <input type="text" name="phone" placeholder="Enter user number">
        <br><br>
        <!-- <input type="password" name="password" placeholder="Enter password">
        <br><br> -->
        <button>Add New User</button>
    </form>
    <!-- Walk as if you are kissing the Earth with your feet. - Thich Nhat Hanh -->
</div>

<style>
    .success-message{
        background-color:lightgreen;
        border-radius:2px;
        padding: 2px 20px;
        margin-bottom:10px;
        display:inline-block;
    }
</style>