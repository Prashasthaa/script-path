<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;

Route::get('/', function () {
    return view('welcome');
});

Route::view('home','home');
Route::view('user','home');
Route::view('about/{name}','about');
