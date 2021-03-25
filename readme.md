<h1>REST API DOCUMENTATION</h1>
<p>Documentação padronizada em REST API referente ao projeto Sem Barreiras Vagas.</p>
<br>
<h2>Estado - GET [list] </h2>
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
        “estados”: [<br>
            {<br>
                "id": “0”,<br>
                "nome": "Rio de Janeiro",<br>
                “uf”: “RJ”,<br>
            },<br>
            {<br>
                "id": “1”,<br>
                "nome": "Sao Paulo",<br>
                “uf”: “SP”,<br>
            }<br>
        ]<br>
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
<h2>Estado - GET [id] </h2>
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
      "id": “0”,<br>
      "nome": "Rio de Janeiro",<br>
      “uf”: “RJ”,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>