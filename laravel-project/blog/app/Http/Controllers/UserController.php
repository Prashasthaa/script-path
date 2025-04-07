<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\View;

class UserController extends Controller
{
    //
    function home(){
        $name="appu";
        $users=['Priya','appu','amma','poppa'];
        return view('home',["name"=>$name,"users"=>$users]);
    }
}
