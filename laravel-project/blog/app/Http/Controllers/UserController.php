<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;
use Illuminate\Support\Facades\Http;
use App\Models\USer;
// use Illuminate\Support\Facades\View;
// use Illuminate\Support\Facades\DB;


class UserController extends Controller
{

    function addUser(Request $req){
        //your db code
        $req->session()->flash("message","User has been added sucessfully");
        $req->session()->flash("name",($req->username));
        return redirect('user');
    }



    // function login(Request $request){
    //     $request->session()->put('user',$request->input('user'));
    //    $request->session()->put('allData',$request->input());
    
    //     return redirect('profile');
    // }

    // function logout(){
    //     session()->pull('user');
    //     return redirect('profile');
    // }

    // function login(Request $req){
    //     echo "Request method is " . $req->method();
    //     echo "<br>";
    //     echo "Path is ".$req->path();
    //     echo "<br>";
    //     echo "name is ".$req->input('name');
    //     echo "<br>";
    //     echo "Password is ".$req->input('password');
    // }


    // function get(){
    //     return "get method";
    // }
    // function post(){
    //     return "post method";
    // }
    // function put(){
    //     return "Put method";
    // }
    // function delete(){
    //     return "Delete";
    // }
    // function any(){
    //     return "This is any method";
    // }

    // function group1(){
    //     return "This is group1 method";
    // }
    // function group2(){
    //     return "This is group2 method";
    // }



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
