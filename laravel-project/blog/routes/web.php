<?php

use Illuminate\Support\Facades\Route;
use App\Http\Controllers\UserController;
// use App\Http\Controllers\HomeController;
// use App\Http\Controllers\StudentaController;
use App\Http\Middleware\AgeCheck;
use App\Http\Middleware\CountryCheck;



Route::get('/', function () {
    return view('welcome');
});

Route::get('users',[UserController::class,'users']);

// Route::view('home','home')->middleware([AgeCheck::class,CountryCheck::class]);
// Route::view('about','about');

// Route::view('home','home')->middleware('check1');
// Route::middleware('check1')->group(function(){
//     Route::view('about','about');
//     Route::view('contact','about');
//     Route::view('list','about');
//     Route::view('home','home');
// });


// Route::controller(StudentaController::class)->group(function(){

//     Route::get('show','show');
//     Route::get('add','add');
//     Route::get('delete','delete');
//     Route::get('about/{name}','about');
// });



// Route::prefix('student')->group(function(){
//     Route::view('/home','home');
//     Route::get('/show',[HomeController::class,'show']);
//     Route::get('/add',[HomeController::class,'add']);
// });


// Route::prefix('student')->group(function(){
//     Route::prefix('india')->group(function(){
//     Route::view('/home','home');
//     Route::get('/show',[HomeController::class,'show']);
//     Route::get('/add',[HomeController::class,'add']);

// });
// Route::prefix('Kerala')->group(function(){
//     Route::view('/home','home');
//     Route::get('/show',[HomeController::class,'show']);
//     Route::get('/add',[HomeController::class,'add']);

// });
// });