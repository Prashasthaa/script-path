<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;
use App\Http\Controllers\HomeController;
use App\Http\Controllers\StudentaController;


Route::get('/', function () {
    return view('welcome');
});


Route::prefix('student')->group(function(){
    Route::view('/home','home');
    Route::get('/show',[HomeController::class,'show']);
    Route::get('/add',[HomeController::class,'add']);
});


Route::prefix('student')->group(function(){
    Route::prefix('india')->group(function(){
    Route::view('/home','home');
    Route::get('/show',[HomeController::class,'show']);
    Route::get('/add',[HomeController::class,'add']);

});
Route::prefix('Kerala')->group(function(){
    Route::view('/home','home');
    Route::get('/show',[HomeController::class,'show']);
    Route::get('/add',[HomeController::class,'add']);

});
});