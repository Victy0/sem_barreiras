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
          &nbsp;&nbsp;&nbsp;“uf”: “RJ”,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
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
      &nbsp;"id": 0,<br>
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
    <td>/api/v1/estado/</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>nome:</b><br></li>
        <li>nome do estado<br></li>
        <li><b>uf:</b><br></li>
        <li>sigla do estado<br></li>
      </ul>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
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
      <ul>
        <li><b>id:</b><br></li>
        <li>id do estado<br></li>
      </ul>
    </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
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
<h3>Cidade - GET [list] </h3>
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
    <td>/api/v1/cidade</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"cidades": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": 0,<br>
          &nbsp;&nbsp;&nbsp;"nome": "Rio de Janeiro",<br>
          &nbsp;&nbsp;&nbsp;"estado_id": 0,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": 1,<br>
          &nbsp;&nbsp;&nbsp;"nome": "Sao Paulo",<br>
          &nbsp;&nbsp;&nbsp;"estado_id": 1,<br>
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
<h3>Cidade - GET [id] </h3>
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
    <td>/api/v1/cidade/{id}</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"nome": "Rio de Janeiro",<br>
      &nbsp;"estado_id": 0,<br>
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
<h3>Cidade - POST</h3>
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
    <td>/api/v1/cidade/</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>nome:</b><br></li>
        <li>nome da cidade<br></li>
        <li><b>estado_id:</b><br></li>
        <li>id do estado da cidade<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"nome": "Rio de Janeiro",<br>
      &nbsp;"estado_id": 0,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Cidade - DELETE</h3>
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
    <td>/api/v1/cidade/{id}</td>
  </tr>
  <td>params</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da cidade<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"message": “Object deleted with success”,<br>
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
<h3>Deficiencia - GET [list] </h3>
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
    <td>/api/v1/deficiencia</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"deficiencias": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": 0,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Deficiencia auditiva",<br>
          &nbsp;&nbsp;&nbsp;"necessidadeRampa": false,<br>
          &nbsp;&nbsp;&nbsp;"necessidadePisoTatil": false,<br>
          &nbsp;&nbsp;&nbsp;"necessidadeSonora": false,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": 1,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Deficiencia visual",<br>
          &nbsp;&nbsp;&nbsp;"necessidadeRampa": false,<br>
          &nbsp;&nbsp;&nbsp;"necessidadePisoTatil": false,<br>
          &nbsp;&nbsp;&nbsp;"necessidadeSonora": false,<br>
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
<h3>Deficiencia - GET [id] </h3>
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
    <td>/api/v1/deficiencia/{id}</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Deficiencia auditiva",<br>
      &nbsp;"tipo": "Deficiencia auditiva",<br>
      &nbsp;"necessidadeRampa": false,<br>
      &nbsp;"necessidadePisoTatil": false,<br>
      &nbsp;"necessidadeSonora": false,<br>
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
<h3>Deficiencia - POST</h3>
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
    <td>/api/v1/deficiencia/</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>descricao:</b><br></li>
        <li>descricao da deficiencia<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Deficiencia auditiva",<br>
      &nbsp;"necessidadeRampa": false,<br>
      &nbsp;"necessidadePisoTatil": false,<br>
      &nbsp;"necessidadeSonora": false,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Deficiencia - DELETE</h3>
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
    <td>/api/v1/deficiencia/{id}</td>
  </tr>
  <td>params</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da deficiencia<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"message": “Object deleted with success”,<br>
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
<h3>Escolaridade - GET [list] </h3>
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
    <td>/api/v1/escolaridade</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"escolaridades": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Ensino medio completo",<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Ensino medio incompleto",<br>
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
<h3>Escolaridade - GET [id] </h3>
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
    <td>/api/v1/escolaridade/{id}</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Ensino medio completo",<br>
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
<h3>Escolaridade - POST</h3>
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
    <td>/api/v1/escolaridade/</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>descricao:</b><br></li>
        <li>descricao da escolaridade<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Ensino medio completo",<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Escolaridade - DELETE</h3>
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
    <td>/api/v1/escolaridade/{id}</td>
  </tr>
  <td>params</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da escolaridade<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"message": “Object deleted with success”,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Candidato - GET [list] </h3>
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
    <td>/api/v1/candidato</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"candidatos": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;"nome": "Carlos Alberto",<br>
          &nbsp;&nbsp;&nbsp;"telefone": "2199999-9999",<br>
          &nbsp;&nbsp;&nbsp;"email": "carlos@gmail.com",<br>
          &nbsp;&nbsp;&nbsp;"curriculo": "https://sembarreiras.com.br/media/curriculo000.pdf",<br>
          &nbsp;&nbsp;&nbsp;"cidade_id": 0,<br>
          &nbsp;&nbsp;&nbsp;"escolaridade_id": 0,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;"nome": "Julliete Freire",<br>
          &nbsp;&nbsp;&nbsp;"telefone": "2199999-9999",<br>
          &nbsp;&nbsp;&nbsp;"email": "jullietevencedora@gmail.com",<br>
          &nbsp;&nbsp;&nbsp;"curriculo": "https://sembarreiras.com.br/media/curriculo001.pdf",<br>
          &nbsp;&nbsp;&nbsp;"cidade_id": 2,<br>
          &nbsp;&nbsp;&nbsp;"escolaridade_id": 0,<br>
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
<h3>Candidato - GET [id] </h3>
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
    <td>/api/v1/candidato/{id}</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"nome": "Carlos Alberto",<br>
      &nbsp;"telefone": "2199999-9999",<br>
      &nbsp;"email": "carlos@gmail.com",<br>
      &nbsp;"curriculo": "https://sembarreiras.com.br/media/curriculo000.pdf",<br>
      &nbsp;"cidade_id": 0,<br>
      &nbsp;"escolaridade_id": 0,<br>
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
<h3>Candidato - POST</h3>
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
    <td>/api/v1/candidato/</td>
  </tr>
  <tr>
    <td>params</td>
    <td>
      <ul>
        <li><b>nome:</b><br></li>
        <li>nome do candidato<br></li>
        <li><b>telefone:</b><br></li>
        <li>telefone do candidato<br></li>
        <li><b>email:</b><br></li>
        <li>email do candidato<br></li>
        <li><b>curriculo:</b><br></li>
        <li>caminho do curriculo do candidato<br></li>
        <li><b>cidade_id:</b><br></li>
        <li>chave para a cidade do candidato<br></li>
        <li><b>escolaridade_id:</b><br></li>
        <li>chave para a escolaridade do candidato<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"nome": "Carlos Alberto",<br>
      &nbsp;"telefone": "2199999-9999",<br>
      &nbsp;"email": "carlos@gmail.com",<br>
      &nbsp;"curriculo": "https://sembarreiras.com.br/media/curriculo000.pdf",<br>
      &nbsp;"cidade_id": 0,<br>
      &nbsp;"escolaridade_id": 0,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Candidato - DELETE</h3>
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
    <td>/api/v1/candidato/{id}</td>
  </tr>
  <td>params</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id do candidato<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"message": “Object deleted with success”,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>