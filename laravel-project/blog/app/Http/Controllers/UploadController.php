<?php

namespace App\Http\Controllers;

use Illuminate\Http\Request;

class UploadController extends Controller
{
    //

    function upload(Request $req){
        $path=$req->file('file')->store('public');
        $fileNameArray=explode('/',$path);
        $fileName=$fileNameArray[1];
        return view('display',['path'=>$fileName]);
        // echo "upload function called";
    }
}
