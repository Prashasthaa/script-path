<div>
    <h1>User Data</h1>
    <table border="1">

        <tr>
            <th>Id</th>
            <th>Name</th>
            <th>email</th>
            <th>Phone</th>
        </tr>

        @foreach($users as $user)
      <tr>
            <td>{{$user->id}}</td>
            <td>{{$user->name}}</td>
            <td>{{$user->email}}</td>
            <td>{{$user->phone}}</td> 
      </tr>
        @endforeach
    </table>
    <!-- Walk as if you are kissing the Earth with your feet. - Thich Nhat Hanh -->
</div>
