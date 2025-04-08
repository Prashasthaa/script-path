<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\View;

class UserController extends Controller
{
    //
    function addUser(Request $request){
        $request->validate([
            'username'=>'required | min:3| max:10',
            'email'=>'required | email',
            'city'=>'required | min:3| max:20 | uppercase',
            

        ],[
            'username.required'=>'User name can not be empty',
            'username.min'=>'User name min  charcaters should be 3',
            'username.max'=>'User name max  charcaters limit is 15',
            'email.required'=>'Email can not be empty',
            'email.email'=>'Enter valid email address',
            'city.uppercase'=>'characters must be uppercase',
        ]);
        return $request;
    }
}
