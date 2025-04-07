<h1>Home page</h1>
<h1>{{$name}}</h1>
<!-- <h1>{{$users[0]}}</h1> -->
 @if($name=='Prashastha')
 <h2>This is Prashastha</h2>
 @elseif($name=='appu')
 <h2>This is appu</h2>
 @else
 <h2>This is other user</h2>
 @endif