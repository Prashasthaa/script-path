<div>
    <h1>Student list</h1>
    <table border="5">
    <tr>
        <td>id</td>
        <td>Name</td>
        <td>Email</td>
      
    </tr>
    <tr>
        @foreach($data as $data)
        <tr>
            <td>{{$data->id}}</td>
            <td>{{$data->name}}</td>
            <td>{{$data->email}}</td>

        </tr>
        @endforeach
    </tr>
</table>
    <!-- Be present above all else. - Naval Ravikant -->
</div>
