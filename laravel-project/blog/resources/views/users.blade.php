<div>
    <h1>users list</h1>
  
<table border="1">
    <tr>
        <td>ID</td>
        <td>Name</td>
        <td>Email</td>
        <td>Phone</td>
    </tr>
    <tr>
        @foreach($users as $user)
        <tr>
            <td>{{$user->id}}</td>
            <td>{{$user->name}}</td>
            <td>{{$user->email}}</td>
            <td>{{$user->phone}}</td>
        </tr>
        @endforeach
    </tr>
</table>

    <!-- Because you are alive, everything is possible. - Thich Nhat Hanh -->
</div>
