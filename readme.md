<h1>REST API DOCUMENTATION</h1>
<p>Documentação padronizada em REST API referente ao projeto Sem Barreiras Vagas.</p>
<br>
<h3>Estado - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
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
    <th>Descrição</th>
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
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do estado<br></li>
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
<h3>Estado - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
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
    <td>body:</td>
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
<br>
<h3>Estado - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/estado/{id}</td>
  </tr>
  <td>params:</td>
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
      &nbsp;"sucesso": true,<br>
      &nbsp;“mensagem”: “Estado deletado com sucesso.”,<br>
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
    <th>Descrição</th>
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
    <th>Descrição</th>
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
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da cidade<br></li>
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
<br>
<h3>Cidade - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
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
    <td>body:</td>
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
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/cidade/{id}</td>
  </tr>
  <td>params:</td>
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
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Cidade deletada com sucesso.”,<br>
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
    <th>Descrição</th>
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
    <th>Descrição</th>
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
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da deficiencia<br></li>
      </ul>
    </td>
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
    <th>Descrição</th>
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
    <td>body:</td>
    <td>
      <ul>
        <li><b>descricao:</b><br></li>
        <li>descricao da deficiencia<br></li>
        <li><b>necessidadeRampa:</b><br></li>
        <li>se é preciso de rampa<br></li>
        <li><b>necessidadePisoTatil:</b><br></li>
        <li>se é preciso de piso tátiil<br></li>
        <li><b>necessidadeSonora:</b><br></li>
        <li>se é preciso de dispositivo sonoro<br></li>
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
<br>
<h3>Deficiencia - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/deficiencia/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>descricao:</b><br></li>
        <li>descricao da deficiencia<br></li>
        <li><b>necessidadeRampa:</b><br></li>
        <li>se é preciso de rampa<br></li>
        <li><b>necessidadePisoTatil:</b><br></li>
        <li>se é preciso de piso tátiil<br></li>
        <li><b>necessidadeSonora:</b><br></li>
        <li>se é preciso de dispositivo sonoro<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>body:</td>
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
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": "Deficiencia atualizada com sucesso.",<br>
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
<h3>Deficiencia - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/deficiencia/{id}</td>
  </tr>
  <td>params:</td>
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
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Deficiencia deletada com sucesso.”,<br>
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
    <th>Descrição</th>
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
    <th>Descrição</th>
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
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da escolaridade<br></li>
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
<br>
<h3>Escolaridade - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
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
    <td>body:</td>
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
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>DELETE</td>
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
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Escolaridade deletada com sucesso.”,<br>
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
<h3>Candidato - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
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
    <th>Descrição</th>
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
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do candidato<br></li>
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
<br>
<h3>Candidato - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
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
    <td>body:</td>
    <td>
      <ul>
        <li><b>nome:</b><br></li>
        <li>nome do candidato<br></li>
        <li><b>telefone:</b><br></li>
        <li>telefone:<br></li>
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
<br>
<h3>Candidato - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/candidato/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do candidato<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>body:</td>
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
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": "Candidato atualizado com sucesso.",<br>
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
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/candidato/{id}</td>
  </tr>
  <td>params:</td>
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
      &nbsp;"sucesso": true,<br>
      &nbsp;"message": “Candidato deletado com sucesso.”,<br>
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
<h3>AreaAtuacao - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/area</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"areas": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Tecnologia da informacao",<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Vendas",<br>
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
<h3>AreaAtuacao - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/area/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da area<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Vendas",<br>
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
<h3>AreaAtuacao - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/area/</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      <ul>
        <li><b>descricao:</b><br></li>
        <li>descricao da area<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": 0,<br>
      &nbsp;"descricao": "Vendas",<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>AreaAtuacao - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/area/{id}</td>
  </tr>
  <td>params:</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da area<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Area de atuacao deletada com sucesso.”,<br>
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
<h3>Vaga - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/vaga</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"vagas": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;"dataCriacao": "29-03-2020",<br>
          &nbsp;&nbsp;&nbsp;"funcao": "Gerente",<br>
          &nbsp;&nbsp;&nbsp;"nivel": "Pleno",<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
          &nbsp;&nbsp;&nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
          &nbsp;&nbsp;&nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
          &nbsp;&nbsp;&nbsp;"beneficios": ["VR", "VA", "VT"],<br>
          &nbsp;&nbsp;&nbsp;"outrosBeneficos": "Seguro de vida",<br>
          &nbsp;&nbsp;&nbsp;"jornadaTrabalho": 8,<br>
          &nbsp;&nbsp;&nbsp;"duracaoVaga": 30,<br>
          &nbsp;&nbsp;&nbsp;"area_id": 0,<br>
          &nbsp;&nbsp;&nbsp;"empresa_id": 0,<br>
          &nbsp;&nbsp;&nbsp;"escolaridade_id": 0,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;"dataCriacao": "09-10-2021",<br>
          &nbsp;&nbsp;&nbsp;"funcao": "Desenvolvedor",<br>
          &nbsp;&nbsp;&nbsp;"nivel": "Junior",<br>
          &nbsp;&nbsp;&nbsp;"descricao": "Desenvolver sistemas web",<br>
          &nbsp;&nbsp;&nbsp;"requisitosNecessarios": ["Fácil Aprendizado", "inglês avançado", "Frances basico"],<br>
          &nbsp;&nbsp;&nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
          &nbsp;&nbsp;&nbsp;"beneficios": ["VR", "VA", "VT"],<br>
          &nbsp;&nbsp;&nbsp;"outrosBeneficos": "Seguro de vida e plano de saúde",<br>
          &nbsp;&nbsp;&nbsp;"jornadaTrabalho": 8,<br>
          &nbsp;&nbsp;&nbsp;"duracaoVaga": 20,<br>
          &nbsp;&nbsp;&nbsp;"area_id": 1,<br>
          &nbsp;&nbsp;&nbsp;"empresa_id": 1,<br>
          &nbsp;&nbsp;&nbsp;"escolaridade_id": 1,<br>
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
<h3>Vaga - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/vaga/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da vaga:<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"dataCriacao": "29-03-2020",<br>
      &nbsp;"funcao": "Gerente",<br>
      &nbsp;"nivel": "Pleno",<br>
      &nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
      &nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
      &nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
      &nbsp;"beneficios": ["VR", "VA", "VT"],<br>
      &nbsp;"outrosBeneficos": "Seguro de vida",<br>
      &nbsp;"jornadaTrabalho": 8,<br>
      &nbsp;"duracaoVaga": 30,<br>
      &nbsp;"area_id": 0,<br>
      &nbsp;"empresa_id": 0,<br>
      &nbsp;"escolaridade_id": 0,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203 / 202 / 403 / 500
    </td>
  </tr>
</table>
<br>
<h3>Vaga - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/vaga/</td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      <ul>
        <li><b>dataCriacao:</b><br></li>
        <li>data de criacao da vaga<br></li>
        <li><b>funcao:</b><br></li>
        <li>funcao da vaga<br></li>
        <li><b>nivel:</b><br></li>
        <li>nivel da vaga<br></li>
        <li><b>descricao:</b><br></li>
        <li>descricao da vaga<br></li>
        <li><b>requisitosNecessarios:</b><br></li>
        <li>requisitos necessarios da vaga<br></li>
        <li><b>requisitosDesejados:</b><br></li>
        <li>requisitos desejados da vaga<br></li>
        <li><b>beneficios:</b><br></li>
        <li>lista beneficios da vaga<br></li>
        <li><b>outrosBeneficios:</b><br></li>
        <li>outros beneficios<br></li>
        <li><b>area_id:</b><br></li>
        <li>chave para area da vaga<br></li>
        <li><b>empresa_id:</b><br></li>
        <li>chave para empresa da vaga<br></li>
        <li><b>escolaridade_id:</b><br></li>
        <li>chave para escolaridade da vaga<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;"dataCriacao": "29-03-2020",<br>
      &nbsp;"funcao": "Gerente",<br>
      &nbsp;"nivel": "Pleno",<br>
      &nbsp;"descricao": "Auxiliar no processo de gerenciamento",<br>
      &nbsp;"requisitosNecessarios": ["Bom relacionamento interpessoal", "inglês básico"],<br>
      &nbsp;"requisitosDesejados": ["Inglês avançado"],<br>
      &nbsp;"beneficios": ["VR", "VA", "VT"],<br>
      &nbsp;"outrosBeneficos": "Seguro de vida",<br>
      &nbsp;"jornadaTrabalho": 8,<br>
      &nbsp;"duracaoVaga": 30,<br>
      &nbsp;"area_id": 0,<br>
      &nbsp;"empresa_id": 0,<br>
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
<h3>Vaga - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/vaga/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da vaga<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      <ul>
        <li><b>dataCriacao:</b><br></li>
        <li>data de criacao da vaga<br></li>
        <li><b>funcao:</b><br></li>
        <li>funcao da vaga<br></li>
        <li><b>nivel:</b><br></li>
        <li>nivel da vaga<br></li>
        <li><b>descricao:</b><br></li>
        <li>descricao da vaga<br></li>
        <li><b>requisitosNecessarios:</b><br></li>
        <li>requisitos necessarios da vaga<br></li>
        <li><b>requisitosDesejados:</b><br></li>
        <li>requisitos desejados da vaga<br></li>
        <li><b>beneficios:</b><br></li>
        <li>lista beneficios da vaga<br></li>
        <li><b>outrosBeneficios:</b><br></li>
        <li>outros beneficios<br></li>
        <li><b>area_id:</b><br></li>
        <li>chave para area da vaga<br></li>
        <li><b>empresa_id:</b><br></li>
        <li>chave para empresa da vaga<br></li>
        <li><b>escolaridade_id:</b><br></li>
        <li>chave para escolaridade da vaga<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": "Vaga atualizada com sucesso.",<br>
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
<h3>Vaga - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/vaga/{id}</td>
  </tr>
  <td>params</td>
  <td>
    <ul>
      <li><b>id:</b><br></li>
      <li>id da vaga<br></li>
    </ul>
  </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": “Vaga deletada com sucesso.”,<br>
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
<h3>Curso - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/curso</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"cursos": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;“nome”: “Excel avancado”,<br>
          &nbsp;&nbsp;&nbsp;“descricao”: “Aprenda a dominar o excel.”,<br>
          &nbsp;&nbsp;&nbsp;“hiperLink”: “https://certificadocursosonline.com/cursos/curso-de-excel/”,<br>
          &nbsp;&nbsp;&nbsp;"preco": 27.90,<br>
          &nbsp;&nbsp;&nbsp;"vaga_id": 0,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “1”,<br>
          &nbsp;&nbsp;&nbsp;“nome”: Java avancado”,<br>
          &nbsp;&nbsp;&nbsp;“descricao”: “Aprenda a programar em java.”,<br>
          &nbsp;&nbsp;&nbsp;“hiperLink”: “https://www.devmedia.com.br/cursos/java”,<br>
          &nbsp;&nbsp;&nbsp;"preco": 37.90,<br>
          &nbsp;&nbsp;&nbsp;"vaga_id": 1,<br>
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
<h3>Curso - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/curso/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;“nome”: “Excel avancado”,<br>
      &nbsp;“descricao”: “Aprenda a dominar o excel.”,<br>
      &nbsp;“hiperLink”: “https://certificadocursosonline.com/cursos/curso-de-excel/”,<br>
      &nbsp;"preco": 27.90,<br>
      &nbsp;"vaga_id": 0,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Curso - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/curso/</td>
  </tr>
  <tr>
    <td>body</td>
    <td>
      <ul>
        <li><b>nome:</b><br></li>
        <li>nome do curso<br></li>
        <li><b>descricao:</b><br></li>
        <li>descricao do curso<br></li>
        <li><b>hiperLink:</b><br></li>
        <li>hiperlink do curso<br></li>
        <li><b>preco:</b><br></li>
        <li>preco do curso<br></li>
        <li><b>vaga_id:</b><br></li>
        <li>chave para a vaga do curso<br></li>
      </ul>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “1”,<br>
      &nbsp;“nome”: Java avancado”,<br>
      &nbsp;“descricao”: “Aprenda a programar em java.”,<br>
      &nbsp;“hiperLink”: “https://www.devmedia.com.br/cursos/java”,<br>
      &nbsp;"preco": 37.90,<br>
      &nbsp;"vaga_id": 1,<br>
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
<h3>Curso - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/curso/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      <ul>
        <li><b>nome:</b><br></li>
        <li>nome do curso<br></li>
        <li><b>descricao:</b><br></li>
        <li>descricao do curso<br></li>
        <li><b>hiperLink:</b><br></li>
        <li>hiperlink do curso<br></li>
        <li><b>preco:</b><br></li>
        <li>preco do curso<br></li>
        <li><b>vaga_id:</b><br></li>
        <li>chave para a vaga do curso<br></li>
      </ul>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": "Curso atualizado com sucesso.",<br>
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
<h3>Curso - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/curso/{id}</td>
  </tr>
  <td>params</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;“mensagem”: "Curso deletado com sucesso.”,<br>
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
<h3>Empresa - GET [list] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/empresa</td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"empresas": [<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;“nome”: “Ambev",<br>
          &nbsp;&nbsp;&nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
          &nbsp;&nbsp;&nbsp;“cnpj”: “43277397000176",<br>
          &nbsp;&nbsp;&nbsp;"email": "institucional@ambev.com",<br>
          &nbsp;&nbsp;&nbsp;"telefone": "21987723341",<br>
          &nbsp;&nbsp;&nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
          &nbsp;&nbsp;&nbsp;"cidade_id": 0,<br>
        &nbsp;&nbsp;},<br>
        &nbsp;&nbsp;{<br>
          &nbsp;&nbsp;&nbsp;"id": “0”,<br>
          &nbsp;&nbsp;&nbsp;“nome”: Colgate",<br>
          &nbsp;&nbsp;&nbsp;“nomeFantasia”: "COLGATE IND.”,<br>
          &nbsp;&nbsp;&nbsp;“cnpj”: "34434685000104",<br>
          &nbsp;&nbsp;&nbsp;"email": "institucional@colgate.com",<br>
          &nbsp;&nbsp;&nbsp;"telefone": "11983226532",<br>
          &nbsp;&nbsp;&nbsp;"endereco": "Av. Paulista, 1294 - Bela VistaSão Paulo - SP",<br>
          &nbsp;&nbsp;&nbsp;"cidade_id": 1,<br>
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
<h3>Empresa - GET [id] </h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>GET</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/empresa/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;“nome”: “Ambev",<br>
      &nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
      &nbsp;“cnpj”: “43277397000176",<br>
      &nbsp;"email": "institucional@ambev.com",<br>
      &nbsp;"telefone": "21987723341",<br>
      &nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
      &nbsp;"cidade_id": 0,<br>
    }<br>
    </td>
  </tr>
  <tr>
    <td>status</td>
    <td>200 OK / 404 Not found / 400 / 203/ 202 / 403 / 500
    </td>
  </tr>
</table>
<h3>Empresa - POST</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/empresa/</td>
  </tr>
  <tr>
    <td>body</td>
    <td>
      <ul>
        <li><b>nome:</b><br></li>
        <li>nome da empresa<br></li>
        <li><b>nomeFantasia:</b><br></li>
        <li>nome fantasia da empresa<br></li>
        <li><b>cpnj:</b><br></li>
        <li>cnpj da empresa<br></li>
        <li><b>email:</b><br></li>
        <li>email da empresa<br></li>
        <li><b>telefone:</b><br></li>
        <li>telefone da empresa<br></li>
        <li><b>endereco:</b><br></li>
        <li>endereco da empresa<br></li>
        <li><b>cidade_id:</b><br></li>
        <li>chave para a cidade do empresa<br></li>
      </ul>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"id": “0”,<br>
      &nbsp;“nome”: “Ambev",<br>
      &nbsp;“nomeFantasia”: “AMBEV IND.”,<br>
      &nbsp;“cnpj”: “43277397000176",<br>
      &nbsp;"email": "institucional@ambev.com",<br>
      &nbsp;"telefone": "21987723341",<br>
      &nbsp;"endereco": "Av. Rio Branco, 120 - Centro, Rio de Janeiro - RJ",<br>
      &nbsp;"cidade_id": 0,<br>
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
<h3>Empresa - PUT</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/empresa/{id}</td>
  </tr>
  <tr>
    <td>params:</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id da empresa<br></li>
      </ul>
    </td>
  </tr>
  <tr>
    <td>body:</td>
    <td>
      <ul>
        <li><b>nome:</b><br></li>
        <li>nome da empresa<br></li>
        <li><b>nomeFantasia:</b><br></li>
        <li>nome fantasia da empresa<br></li>
        <li><b>cpnj:</b><br></li>
        <li>cnpj da empresa<br></li>
        <li><b>email:</b><br></li>
        <li>email da empresa<br></li>
        <li><b>telefone:</b><br></li>
        <li>telefone da empresa<br></li>
        <li><b>endereco:</b><br></li>
        <li>endereco da empresa<br></li>
        <li><b>cidade_id:</b><br></li>
        <li>chave para a cidade do empresa<br></li>
      </ul>      
    </td>
  </tr>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;"mensagem": "Empresa atualizada com sucesso.",<br>
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
<h3>Empresa - DELETE</h3>
<table style="width:100%">
  <tr>
    <th>Propriedade</th>
    <th>Descrição</th>
  </tr>
  <tr>
    <td>metodo</td>
    <td>POST</td>
  </tr>
  <tr>
    <td>curl</td>
    <td>/api/v1/curso/{id}</td>
  </tr>
  <td>params</td>
    <td>
      <ul>
        <li><b>id:</b><br></li>
        <li>id do curso<br></li>
      </ul>
    </td>
  <tr>
    <td>response</td>
    <td>
    {<br>
      &nbsp;"sucesso": true,<br>
      &nbsp;“mensagem”: "Empresa deletada com sucesso.”,<br>
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