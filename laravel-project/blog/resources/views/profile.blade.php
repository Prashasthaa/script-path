<div>
    <h1>Profile page</h1>
   @if(session('user'))
   <h1>Welcome,{{session('user')}}</h1>
   @else
   <h1>No user found in session <a href="login">Login</a></h1>
   @endif
   <a href="logout">Logout</a>

   {{session('allData')['user']}}
</div>
