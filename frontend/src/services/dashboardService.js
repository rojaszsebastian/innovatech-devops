import { bffApi } from '../api/dashboardApi';

export const getDashboardResumen = async () => {

    try {

        const response = await bffApi.get('/proyectos');

        if (!response.data) {
            throw new Error("Respuesta del servidor sin contenido");
        }

        return response.data;

    } catch (error) {

        console.error('[Service Error] Fallo al consultar proyectos:', error.message);

        throw error;
    }
};