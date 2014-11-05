$(document).ready(function(){
  //   alert('Probando jquery');
  $("#ver-nomina").click(function(){
     $.ajax({
      url:'nomina',
      method:'get',
      data:{
        nombre:$("#texto-nombre").val(),
        edad:$("#texto-edad").val()
      },
      success:function(no_me_olvides) {
              alert(no_me_olvides);
                //$("#resulatado").html(no_me_olvides);
            },
            failure:function(error){
                
           }
      });
    });
});
