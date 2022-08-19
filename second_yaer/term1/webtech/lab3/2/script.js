function validateForm() {
    let err = "";
    let identify = document.forms["form"]["identify"].value;
    let firstname = document.forms["form"]["firstname"].value;
    let lastname = document.forms["form"]["lastname"].value;
    let address = document.forms["myForm"]["address"].value;
    let amphoe = document.forms["myForm"]["amphoe"].value;
    let district = document.forms["myForm"]["district"].value;
    let postnumber = document.forms["myForm"]["postnumber"].value;
    let number = document.forms["myForm"]["number"].value;
    
    if(identify.length > 13){
        err += "* จำนวนเลขของบัตรประชาชนเกิน"
    }
    if(firstname.length>20 || firstname<2){
        err += "* มีตัวอักษร ความยาวระหว่าง 2-20 ตัวอักษร";
    }
    if(lastname.length>2 || lastname.length<30){
        err += "* มีตัวอักษร ความยาวระหว่าง 2-30 ตัวอักษร"
    }
    if(address.length <= 5){
        err += "* ความยาวที่อยู่ไม่ต่ำกว่า 5 ตัวอักษร";
    }
    if(amphoe.length <= 2){
        err += "* ความยาวอำเภอ/แขวงไม่ต่ำกว่า 2 ตัวอักษร";
    }
    if(district.length <= 2){
        err += "* ความยาวตำบล/แขวงไม่ต่ำกว่า 2 ตัวอักษร";
    }
    if(number.length > 10){
        err += "* เบอร์โทรศัพท์จำนวน 9-10 หลัก"
    }
    if(postnumber.length > 5) {
        err += "* รหัสไปรษณีย์จำนวน 5 หลัก"
    }
    document.querySelector(".error").innerHTML = err;
}