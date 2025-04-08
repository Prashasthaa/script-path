<div>
    <h2>Add New User</h2>
   <!-- @if($errors->any())
        @foreach($errors->all() as $error)
            <div style ="color:red">{{$error}}</div>
        @endforeach
    @endif-->
    <form action="adduser" method="post">
        @csrf
        <div class="input-wrapper">
            <input type="text" 
            placeholder="Enter User name" 
            name="username" 
            value="{{old('username')}}"
            class="{{$errors->first('username')?'input-error':''}}">
            <span style ="color:red">@error('username'){{$message}}@enderror</span>
        </div>


        <div class="input-wrapper">
            <input 
            type="text" 
            placeholder="Enter User email" 
            name="email" 
            value="{{old('email')}}"
            class="{{$errors->first('email')?'input-error':''}}" >
            <span style ="color:red">@error('email'){{$message}}@enderror</span>
        </div>
        <div class="input-wrapper">
            <input type="text" placeholder="Enter User city" name="city" value="{{old('city')}}"
            class="{{$errors->first('username')?'input-error':''}}">
            <span style ="color:red">@error('city'){{$message}}@enderror</span>
        </div>
        <!-- <div class="input-wrapper" >
            <h4>User Skills</h4>
            <input type="checkbox"name="skill[]" value="PHP" id="php">
                <label  for="php">PHP</label>
                <input type="checkbox"name="skill[]" value="Node" id="node">
                <label  for="node">Node</label>
                <input type="checkbox"name="skill[]" value="Java" id="java">
                <label  for="java">Java</label>
                <br>
                <span style ="color:red" >@error('skill'){{$message}}@enderror</span>
        </div> -->
        <div class="input-wrapper" >
            <button>Add new User</button>
        </div>
    </form>
    <!-- Simplicity is the consequence of refined emotions. - Jean D'Alembert -->
</div>

<style>
    input{
        border: orange 1px solid;
    height: 35px;
    width: 200px;
    border-radius: 2px;
    color: orange;
    }
    .input-wrapper{
        margin:10px;
    }
    button{
        border: orange 1px solid;
    height: 35px;
    width: 200px;
    border-radius: 2px;
    color: orange;
    background-color:#fff;
    cursor:pointer;
    }
    .input-error{
        border:1px solid red;
        color:red;
    }
</style>


    <!-- Simplicity is the consequence of refined emotions. - Jean D'Alembert -->
</div>
