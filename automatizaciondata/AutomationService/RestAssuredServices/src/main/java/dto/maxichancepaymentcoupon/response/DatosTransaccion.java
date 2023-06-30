package dto.maxichancepaymentcoupon.response;

import dto.comunclass.Geolocalizacion;

public class DatosTransaccion {

    public long fecha;
    public String dispositivo;
    public String tokenId;
    public String canal;
    public int idAplicacion;
    public Geolocalizacion geolocalizacion;
    public DatosCliente datosCliente;
    public String version;
    public int id;

    public long getFecha() {
        return fecha;
    }

    public void setFecha(long fecha) {
        this.fecha = fecha;
    }

    public String getDispositivo() {
        return dispositivo;
    }

    public void setDispositivo(String dispositivo) {
        this.dispositivo = dispositivo;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int getIdAplicacion() {
        return idAplicacion;
    }

    public void setIdAplicacion(int idAplicacion) {
        this.idAplicacion = idAplicacion;
    }

    public Geolocalizacion getGeolocalizacion() {
        return geolocalizacion;
    }

    public void setGeolocalizacion(Geolocalizacion geolocalizacion) {
        this.geolocalizacion = geolocalizacion;
    }

    public DatosCliente getDatosCliente() {
        return datosCliente;
    }

    public void setDatosCliente(DatosCliente datosCliente) {
        this.datosCliente = datosCliente;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
