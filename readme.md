<h1>REST API DOCUMENTATION</h1>
<p>Documentação padronizada em REST API referente ao projeto Sem Barreiras Vagas.</p>
<br>
<h3>Estado - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/estado</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;“estados”: [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;"nome": "Rio de Janeiro",<br>
          &nbsp;&nbsp;&nbsp;“uf”: “RJ”,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;"nome": "Sao Paulo",<br>
          &nbsp;&nbsp;&nbsp;“uf”: “SP”,<br>
        &nbsp;&nbsp;}<br>
        &nbsp;]<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<br>
<h3>Estado - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/estado/{id}</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"nome": "Rio de Janeiro",<br>
      &nbsp;“uf”: “RJ”,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Estado - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/estado</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      nome:
      &nbsp; nome do estado
      uf:
      &nbsp; sigla do estado
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"nome": "Rio de Janeiro",<br>
      &nbsp;“uf”: “RJ”,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Estado - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Description</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/estado/{id}</td>
  </tr>
  <td>params</td>
    <td>
      id:
      &nbsp; id do estado
    </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"nome": "Rio de Janeiro",<br>
      &nbsp;“uf”: “RJ”,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>