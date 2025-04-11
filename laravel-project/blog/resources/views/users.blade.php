
<div>
    <h1>USers</h1>
    <table border="1">
        <tr>
            <th>Name</th>
            <th>email</th>
            <th>Phone</th>
        </tr>
        @foreach($users as $user)
      <tr>
            <td>{{$user->name}}</td>
            <td>{{$user->email}}</td>
            <td>{{$user->phone}}</td> 
      </tr>
        @endforeach
  
    </table>
</div>
