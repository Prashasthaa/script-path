<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;
use App\Models\USer;
// use Illuminate\Support\Facades\View;
// use Illuminate\Support\Facades\DB;


class UserController extends Controller
{

    function get(){
        return "get method";
    }
    function post(){
        return "post method";
    }
    function put(){
        return "Put method";
    }
    function delete(){
        return "Delete";
    }



    // function queries(){
        // $response=User::get();
        // $response=User::all();

        // $response=USer::insert([
        //     'name'=>'kaay',
        //     'email'=>'kay@test.com',
        //     'phone'=>'5645654'
        // ]);
        // if($response){
        //     return "Data isnserted";
        // }
        // else{
        //     return "Error in inserting ";
        // }

        //    $response=USer::where('name','kaay');

        // return view('user',['users'=>$response]);

    // }

    // function getUSer(){
    //     $response=Http::get('https://jsonplaceholder.typicode.com/users/1');
    //     $response =$response->body();
    //     return view('users',['data'=>json_decode($response)]);
    // }

    // function users(){
    //     $users= DB::select('select * from users');
    //     return view('users',['users'=>$users]);
    // }

    // function addUser(Request $request){
    //     $request->validate([
    //         'username'=>'required | min:3| max:10',
    //         'email'=>'required | email',
    //         'city'=>'required | min:3| max:20 | uppercase',
            

    //     ],[
    //         'username.required'=>'User name can not be empty',
    //         'username.min'=>'User name min  charcaters should be 3',
    //         'username.max'=>'User name max  charcaters limit is 15',
    //         'email.required'=>'Email can not be empty',
    //         'email.email'=>'Enter valid email address',
    //         'city.uppercase'=>'characters must be uppercase',
    //     ]);
    //     return $request;
    // }
}
