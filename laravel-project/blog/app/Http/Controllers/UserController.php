<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\View;

class UserController extends Controller
{
    //
    function home(){
       
        return view('home');
    }

    function userAbout(){
       
        return view('about');
    }
}
